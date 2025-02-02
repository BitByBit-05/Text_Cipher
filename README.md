# Text_Cipher

Welcome to the **Text Cipher** project! This JavaFX application is designed to transform any text into a secret encrypted message using a set of fun and unique rules. Whether you're a fan of cryptography or just love playing with text, this project will pique your interest.

## Why This Project is Cool
- **Creative Encryption**: The encryption rules are designed to be both logical and quirky, making the output unpredictable and fun to explore.
- **Interactive GUI**: The program provides a clean and intuitive interface for users to input text and see the encrypted result instantly.
- **Learning Opportunity**: This project is a great way to practice JavaFX, string manipulation, and event-driven programming.

## How It Works
1. **Input Your Message**: Type any text into the provided text field.
2. **Encrypt**: Click the **Encrypt** button to transform your message using the following rules:
   - Uppercase letters **A-M** become lowercase.
   - Uppercase letters **N-Z** turn into `$` followed by a number (e.g., `N` becomes `$0`).
   - Lowercase letters **a-m** are replaced with `*`, `^`, or `#` based on divisibility rules.
   - Lowercase letters **n-z** are shifted forward in the alphabet by the length of the input string.
   - Non-alphabetic characters remain unchanged.

## Example
Input: `This TExT is a-TESt`  
Output: `$6#*l $6eq$6 *l ^-$6e$5m`

## Screenshots
Here’s what the program looks like in action:

### Initial Launch
![Initial Launch](https://github.com/your-username/BlackJack_Game/raw/main/textcipher_initial.png)

### After Encryption
![After Encryption](https://github.com/your-username/BlackJack_Game/raw/main/textcipher_encrypted.png)

---

## Try It Yourself
1. Clone the repository.
2. Run the `TextCipher.java` file.
3. Enter your message and watch it transform into a secret code!

---
