# Text_Cipher

This JavaFX application encrypts user-input text based on specific rules. The program provides a graphical user interface (GUI) for users to enter a message and see the encrypted result.

## Features
- **Input Field**: Users can type a message into a labeled text field.
- **Encrypt Button**: Pressing this button encrypts the message using the following rules:
  1. Uppercase letters **A-M** are converted to lowercase.
  2. Uppercase letters **N-Z** are replaced with `$` followed by a number (0-12).
  3. Lowercase letters **a-m** are replaced with `*`, `^`, or `#` based on divisibility rules.
  4. Lowercase letters **n-z** are shifted forward in the alphabet by the length of the input string.
  5. Non-alphabetic characters remain unchanged.

## How to Use
1. Run the `TextCipher.java` file.
2. Enter your message in the text field.
3. Click the **Encrypt** button to see the encrypted message.

## Screenshots
Below are sample outputs of the program:

### Initial Launch
![Initial Launch](https://github.com/your-username/BlackJack_Game/raw/main/textcipher_initial.png)

### After Encryption
![After Encryption](https://github.com/your-username/BlackJack_Game/raw/main/textcipher_encrypted.png)

## Code Structure
- **TextCipher.java**: Main JavaFX application file.
- **Images**: Screenshots of the program in action.

---

## Requirements
- JavaFX must be installed and configured.
- Ensure the images are placed in the correct directory for the `README.md` to display them properly.

---
