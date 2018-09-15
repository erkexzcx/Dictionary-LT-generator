package ldg;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();

        // Hide some UI parts according to selected checkboxes:
        var useEndings = jCheckBox_convertEndings.isSelected();
        var useNumbers = jCheckBox_appendText.isSelected();

        jPanel_endings.setEnabled(useEndings);
        jCheckBox_includeWordsWithOriginalEndings.setEnabled(useEndings);
        jTextArea_endings.setEnabled(useEndings);

        jPanel_appendText.setEnabled(useNumbers);
        jCheckBox_includeWordsWithoutAppendedText.setEnabled(useNumbers);
        jTextArea_appendText.setEnabled(useNumbers);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser_fileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField_inputDictionaryPath = new javax.swing.JTextField();
        jButton_browseInputDictionary = new javax.swing.JButton();
        jTextField_outputDictionaryPath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar_progressBar = new javax.swing.JProgressBar();
        jButton_start = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel_appendText = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_appendText = new javax.swing.JTextArea();
        jCheckBox_includeWordsWithoutAppendedText = new javax.swing.JCheckBox();
        jCheckBox_appendText = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel_endings = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_endings = new javax.swing.JTextArea();
        jCheckBox_includeWordsWithOriginalEndings = new javax.swing.JCheckBox();
        jCheckBox_convertEndings = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox_startsWithUppercase = new javax.swing.JCheckBox();
        jCheckBox_startsWithLowercase = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lithuanian dictionary generator v2.0");
        setMinimumSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel1.setText("Author: Erikas Rudinskas (erikmnkl@gmail.com). Report any issues on github!");

        jTextField_inputDictionaryPath.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jTextField_inputDictionaryPath.setToolTipText("Path to input dictionary file");

        jButton_browseInputDictionary.setText("Browse");
        jButton_browseInputDictionary.setToolTipText("Browse for input dictionary file");
        jButton_browseInputDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_browseInputDictionaryActionPerformed(evt);
            }
        });

        jTextField_outputDictionaryPath.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jTextField_outputDictionaryPath.setToolTipText("Path to output dictionary file. Application will insert it for you once you select input dictionary file.");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Input dictionary:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Output dictionary:");

        jProgressBar_progressBar.setStringPainted(true);

        jButton_start.setText("Generate output dictionary");
        jButton_start.setToolTipText("Click if you want to start generating output dictionary");
        jButton_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_startActionPerformed(evt);
            }
        });

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerLocation(422);
        jSplitPane1.setDividerSize(0);
        jSplitPane1.setResizeWeight(0.5);
        jSplitPane1.setToolTipText("");
        jSplitPane1.setFocusable(false);

        jPanel_appendText.setBorder(javax.swing.BorderFactory.createTitledBorder("Append text"));

        jTextArea_appendText.setColumns(20);
        jTextArea_appendText.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jTextArea_appendText.setRows(5);
        jTextArea_appendText.setText("123\n1\n2017\n2018\n#!\n$$$\n45");
        jTextArea_appendText.setToolTipText("New line separated.");
        jScrollPane2.setViewportView(jTextArea_appendText);

        jCheckBox_includeWordsWithoutAppendedText.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox_includeWordsWithoutAppendedText.setSelected(true);
        jCheckBox_includeWordsWithoutAppendedText.setText("Also export words without appended text");
        jCheckBox_includeWordsWithoutAppendedText.setToolTipText("Words without appended text will not be exported if this is not checked.");

        jCheckBox_appendText.setSelected(true);
        jCheckBox_appendText.setText("Append given text");
        jCheckBox_appendText.setToolTipText("Check this box if you want to export words with given text appended to the end of each word");
        jCheckBox_appendText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_appendTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_appendTextLayout = new javax.swing.GroupLayout(jPanel_appendText);
        jPanel_appendText.setLayout(jPanel_appendTextLayout);
        jPanel_appendTextLayout.setHorizontalGroup(
            jPanel_appendTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_appendTextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_appendTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jCheckBox_includeWordsWithoutAppendedText, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(jCheckBox_appendText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_appendTextLayout.setVerticalGroup(
            jPanel_appendTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_appendTextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_appendText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_includeWordsWithoutAppendedText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_appendText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_appendText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel_endings.setBorder(javax.swing.BorderFactory.createTitledBorder("Endings table"));

        jTextArea_endings.setColumns(20);
        jTextArea_endings.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jTextArea_endings.setRows(5);
        jTextArea_endings.setText("dis=>dzio\nias=>io\nia=>ios\nis=>io\nas=>o\ntis=>cio\ntys=>cio\ne=>es\na=>os\nsuo=>ers\nmuo=>mens\nus=>aus");
        jTextArea_endings.setToolTipText("New line separated. Format is 'from=>to'.");
        jScrollPane1.setViewportView(jTextArea_endings);

        jCheckBox_includeWordsWithOriginalEndings.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jCheckBox_includeWordsWithOriginalEndings.setSelected(true);
        jCheckBox_includeWordsWithOriginalEndings.setText("Also export words with original endings");
        jCheckBox_includeWordsWithOriginalEndings.setToolTipText("Words with original endings will not be exported if this is not checked.");

        jCheckBox_convertEndings.setSelected(true);
        jCheckBox_convertEndings.setText("Change given endings");
        jCheckBox_convertEndings.setToolTipText("Check this box if you want to export words with their endings changed as per given 'from=>to' table.");
        jCheckBox_convertEndings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_convertEndingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_endingsLayout = new javax.swing.GroupLayout(jPanel_endings);
        jPanel_endings.setLayout(jPanel_endingsLayout);
        jPanel_endingsLayout.setHorizontalGroup(
            jPanel_endingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_endingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_endingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_convertEndings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_includeWordsWithOriginalEndings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel_endingsLayout.setVerticalGroup(
            jPanel_endingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_endingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_convertEndings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_includeWordsWithOriginalEndings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("First letter case"));

        jCheckBox_startsWithUppercase.setSelected(true);
        jCheckBox_startsWithUppercase.setText("UPPERcase");
        jCheckBox_startsWithUppercase.setToolTipText("Check if you want to export words starting with uppercase");

        jCheckBox_startsWithLowercase.setSelected(true);
        jCheckBox_startsWithLowercase.setText("lowercase");
        jCheckBox_startsWithLowercase.setToolTipText("Check if you want to export words starting with lowercase");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_startsWithUppercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox_startsWithLowercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_startsWithUppercase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox_startsWithLowercase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_endings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_endings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_outputDictionaryPath)
                    .addComponent(jButton_start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField_inputDictionaryPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_browseInputDictionary))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar_progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_inputDictionaryPath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_browseInputDictionary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_outputDictionaryPath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_browseInputDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_browseInputDictionaryActionPerformed
        if (jFileChooser_fileChooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }

        // Set input dictionary path to text field:
        var inputFullPath = jFileChooser_fileChooser.getSelectedFile().getAbsolutePath();
        jTextField_inputDictionaryPath.setText(inputFullPath);

        // Set output dictionary path to text field:
        jTextField_outputDictionaryPath.setText(getOutputFullPathFromInputFullPath(inputFullPath, "-generated"));
    }//GEN-LAST:event_jButton_browseInputDictionaryActionPerformed

    private void jCheckBox_convertEndingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_convertEndingsActionPerformed
        var useEndings = jCheckBox_convertEndings.isSelected();
        jPanel_endings.setEnabled(useEndings);
        jCheckBox_includeWordsWithOriginalEndings.setEnabled(useEndings);
        jTextArea_endings.setEnabled(useEndings);
    }//GEN-LAST:event_jCheckBox_convertEndingsActionPerformed

    private void jCheckBox_appendTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_appendTextActionPerformed
        var useNumbers = jCheckBox_appendText.isSelected();
        jPanel_appendText.setEnabled(useNumbers);
        jCheckBox_includeWordsWithoutAppendedText.setEnabled(useNumbers);
        jTextArea_appendText.setEnabled(useNumbers);
    }//GEN-LAST:event_jCheckBox_appendTextActionPerformed

    private void jButton_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_startActionPerformed
        jButton_start.setEnabled(false);
        
        // Move everything to separate thread, otherwise UI will freeze!
        new Thread(this::startButtonClicked).start();
    }//GEN-LAST:event_jButton_startActionPerformed

    private void startButtonClicked() {
        // Validate user input:
        if ("".equals(jTextField_inputDictionaryPath.getText())) {
            showPopup("You did not select input dictionary file!", "Error!", JOptionPane.ERROR_MESSAGE);
            jButton_start.setEnabled(true);
            return;
        }
        if ("".equals(jTextField_outputDictionaryPath.getText())) {
            showPopup("You did not select output dictionary file!", "Error!", JOptionPane.ERROR_MESSAGE);
            jButton_start.setEnabled(true);
            return;
        }
        File inputFile = new File(jTextField_inputDictionaryPath.getText());
        File outputFile = new File(jTextField_outputDictionaryPath.getText());
        if (!Validation.fileExists(inputFile)) {
            showPopup("Input file does not exist!", "Error!", JOptionPane.ERROR_MESSAGE);
            jButton_start.setEnabled(true);
            return;
        }
        if (Validation.fileExists(outputFile)) {
            showPopup("Output file already exist! Rename it or delete it.", "Error!", JOptionPane.ERROR_MESSAGE);
            jButton_start.setEnabled(true);
            return;
        }
        if (!Validation.validOutputFilePath(outputFile)) {
            showPopup("Can't create output dictionary file!.", "Error!", JOptionPane.ERROR_MESSAGE);
            jButton_start.setEnabled(true);
            return;
        }
        if (jCheckBox_convertEndings.isSelected()) {
            if (!Validation.validEndings(jTextArea_endings.getText())) {
                showPopup("Incorrect endings provided! Check if you haven't made any TYPO.", "Error!", JOptionPane.ERROR_MESSAGE);
                jButton_start.setEnabled(true);
                return;
            }
        }

        // Count lines in input file:
        double linesCount = 0;
        try {
            linesCount = getLinesCountInFile(jTextField_inputDictionaryPath.getText());
        } catch (IOException ex) {
            showPopup("Failed to count lines in input dictionary file!", "Error!", JOptionPane.ERROR_MESSAGE);
            jButton_start.setEnabled(true);
            return;
        }

        // Looks good, so let's create manager which communicates with threads:
        Manager manager = null;
        try {
            manager = new Manager(jProgressBar_progressBar, linesCount, inputFile, outputFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1); // Just exit. It shouldn't happen at all
        }

        // Create array from word endings:
        String tmp[] = jTextArea_endings.getText().trim().split("\\n");
        EndingPair endingPairs[] = new EndingPair[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            String splitted[] = tmp[i].split("=>");
            endingPairs[i] = new EndingPair(splitted[0], splitted[1]);
        }

        // Create array from append text:
        String appendText[] = jTextArea_appendText.getText().trim().split("\\n");
        
        System.out.println("Amount of lines in input file: " + linesCount);

        // Create threads pool:
        int processorCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(processorCount);

        // Submit tasks to thread pool:
        for (int i = 0; i < processorCount; i++) {
            executor.submit(
                    new Processor(
                            manager,
                            jCheckBox_convertEndings.isSelected(),
                            jCheckBox_includeWordsWithOriginalEndings.isSelected(),
                            jCheckBox_appendText.isSelected(),
                            jCheckBox_includeWordsWithoutAppendedText.isSelected(),
                            jCheckBox_startsWithLowercase.isSelected(),
                            jCheckBox_startsWithUppercase.isSelected(),
                            endingPairs,
                            appendText,
                            (i == 0) /* Only first thread is reponsible for updating UI */
                    ));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS); // Wait until everything is finished!
        } catch (InterruptedException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        jProgressBar_progressBar.setValue(0);
        jProgressBar_progressBar.setString("Completed!");

        // Closes all buffers
        try {
            manager.cleanUp();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Enable start button:
        jButton_start.setEnabled(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    private static String getOutputFullPathFromInputFullPath(String inputFullPath, String appendText) {
        int lastSeparatorIndex = inputFullPath.lastIndexOf(File.separator);
        int lastDotIndex = inputFullPath.lastIndexOf('.');

        // If file has no extension:
        if (lastDotIndex == -1 || lastDotIndex < lastSeparatorIndex) {
            return new StringBuilder(inputFullPath).append(appendText).toString();
        }

        return new StringBuilder(inputFullPath.substring(0, lastDotIndex))
                .append(appendText)
                .append(inputFullPath.substring(lastDotIndex))
                .toString();
    }

    private static double getLinesCountInFile(String filename) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));
        try {
            byte[] c = new byte[1024];

            int readChars = is.read(c);
            if (readChars == -1) {
                // bail out if nothing to read
                return 0;
            }

            // make it easy for the optimizer to tune this loop
            double count = 0;
            while (readChars == 1024) {
                for (int i = 0; i < 1024;) {
                    if (c[i++] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            // count remaining characters
            while (readChars != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            return count == 0 ? 1 : count;
        } finally {
            is.close();
        }
    }

    public static void showPopup(String message, String title, int type) {
        JOptionPane.showMessageDialog(null, message, title, type);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_browseInputDictionary;
    private javax.swing.JButton jButton_start;
    private javax.swing.JCheckBox jCheckBox_appendText;
    private javax.swing.JCheckBox jCheckBox_convertEndings;
    private javax.swing.JCheckBox jCheckBox_includeWordsWithOriginalEndings;
    private javax.swing.JCheckBox jCheckBox_includeWordsWithoutAppendedText;
    private javax.swing.JCheckBox jCheckBox_startsWithLowercase;
    private javax.swing.JCheckBox jCheckBox_startsWithUppercase;
    private javax.swing.JFileChooser jFileChooser_fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_appendText;
    private javax.swing.JPanel jPanel_endings;
    private javax.swing.JProgressBar jProgressBar_progressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea_appendText;
    private javax.swing.JTextArea jTextArea_endings;
    private javax.swing.JTextField jTextField_inputDictionaryPath;
    private javax.swing.JTextField jTextField_outputDictionaryPath;
    // End of variables declaration//GEN-END:variables
}
