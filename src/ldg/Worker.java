package ldg;

import java.util.ArrayList;
import java.util.List;

public class Worker implements Runnable {

    WorkersManager workersManager;
    boolean changeEndings;
    boolean changeEndingsExportOriginals;
    boolean appendText;
    boolean appendTextExportOriginals;
    boolean uppercase;
    boolean lowercase;
    EndingPair[] endingPairsArray;
    String appendTextArray[];
    boolean updateUi;

    List<String> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<String> tmpList = new ArrayList<>();

    public Worker(
            WorkersManager workersManager,
            boolean changeEndings,
            boolean changeEndingsExportOriginals,
            boolean appendText,
            boolean appendTextExportOriginals,
            boolean uppercase,
            boolean lowercase,
            EndingPair endingPairsArray[],
            String[] appendTextArray,
            boolean updateUi) {
        this.workersManager = workersManager;
        this.changeEndings = changeEndings;
        this.changeEndingsExportOriginals = changeEndingsExportOriginals;
        this.appendText = appendText;
        this.appendTextExportOriginals = appendTextExportOriginals;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.endingPairsArray = endingPairsArray;
        this.appendTextArray = appendTextArray;
        this.updateUi = updateUi;
    }

    @Override
    public void run() {
        String word;
        String tmp;
        while ((word = workersManager.readWord(updateUi)) != null) {

            list1.clear();
            list2.clear();
            tmpList.clear();

            // Populate list1 with words
            //==================================================================
            if (uppercase) {
                list1.add(Character.toUpperCase(word.charAt(0)) + word.substring(1));
            }
            if (lowercase) {
                list1.add(Character.toLowerCase(word.charAt(0)) + word.substring(1));
            }
            if (!uppercase && !lowercase) {
                list1.add(word); // neither uppercase neither lowercase, so let's just use original word
            }
            //==================================================================

            // Populate list2 with words from list1:
            //==================================================================
            if (changeEndings) {

                // Copy list1 words to list2
                if (changeEndingsExportOriginals) {
                    list1.forEach((wordFromTheList) -> {
                        list2.add(wordFromTheList);
                    });
                }

                // What's cool about list1 at this stage? All words in it have equal length!
                int wLength = list1.get(0).length();

                // Use words from list1 to generate new words to list2
                list1.forEach((wordFromTheList) -> {
                    for (EndingPair ep : endingPairsArray) {
                        // Before we check if words ends with X, we then check if word is longer than X:
                        if (wLength > ep.getFromLength()) {
                            // Check if word ends with X:
                            if (wordFromTheList.endsWith(ep.getFrom())) {
                                // Change ending and add to list1
                                list2.add(
                                        wordFromTheList.substring(0, wLength - ep.getFromLength()) + ep.getTo()
                                );
                            }
                        }
                    }
                });

                // Move everything from list1 and list2:
                list1.clear();
                tmpList = list1;
                list1 = list2;
                list2 = tmpList;

            }
            //==================================================================

            // Populate list2 with words from list1:
            //==================================================================
            if (appendText) {

                // Copy list1 words to list2
                if (appendTextExportOriginals) {
                    list1.forEach((wordFromTheList) -> {
                        list2.add(wordFromTheList);
                    });
                }

                // Use words from list1 to generate new words to list2
                list1.forEach((wordFromTheList) -> {
                    for (String a : appendTextArray) {
                        list2.add(wordFromTheList + a);
                    }
                });

                // Switch list1 and list2:
                list1.clear();
                tmpList = list1;
                list1 = list2;
                list2 = tmpList;

            }
            //==================================================================

            // Write everything from list1 to output file:
            list1.forEach((wordFromTheList) -> {
                workersManager.writeWord(wordFromTheList);
            });

        }

        // Clear lists at the end:
        list1.clear();
        list2.clear();
        tmpList.clear();
    }

}
