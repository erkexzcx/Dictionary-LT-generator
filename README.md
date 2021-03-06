# Lithuanian dictionary generator

[![License](https://img.shields.io/github/license/erkexzcx/Lithuanian-dictionary-generator)](LICENSE)
[![Github All Releases](https://img.shields.io/github/downloads/erkexzcx/Lithuanian-dictionary-generator/total.svg)](https://github.com/erkexzcx/Lithuanian-dictionary-generator/releases)

Lithuanian dictionary generator is a tool designed to generate password-like words dictionary, which is used for cracking common Lithuanian passwords. In order to generate such dictionary, you need to get a list of simple basic Lithuanian words in a form of text file.

__DISCLAIMER__: I take no responsibility for any misuse of this application. It was created only for penetration testing and nothing else.

## About

For example, you have a file `c:\input_dictionary.txt` with the following contents:
```
erikas
petras
```

and with those words you want to generate new `c:\input_dictionary-generated.txt` file with the following contents:
```
Petras
petras
Petro
petro
Petras10
Petras42
petras10
petras42
Petro10
Petro42
petro10
petro42
Erikas
erikas
Eriko
eriko
Erikas10
Erikas42
erikas10
erikas42
Eriko10
Eriko42
eriko10
eriko42
```
And this is the purpose of this application - out of a few words it can generate extremelly large dictionaries in minutes or even seconds.

## More information

### Checkboxes
Hover mouse over any checkbox to show the tooltip.

### Textareas
1. __Replace endings__ textarea - Endings must be provided in a form of `change_what=>change_to` and such pairs must be separated by new line. There should be no need to edit this textarea at all, unless you find some word endings that are not added by default. Also create issue on Github so I can add missing endings.
2. __Append text__ textarea - Text must be separated by new line. Initially, this textarea was intended for numbers only, but you can use it to append any text you want.
