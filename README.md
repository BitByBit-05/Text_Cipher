# Text_Cipher

Welcome to the **Text Cipher** project! This JavaFX application is designed to transform any text into a secret encrypted message using a set of fun and unique rules. Whether you're a fan of cryptography or just love playing with text, this project will pique your interest.

## Why This Project is Cool
- **Creative Encryption**: The encryption rules are designed to be both logical and quirky, making the output unpredictable and fun to explore.
- **Interactive GUI**: The program provides a clean and intuitive interface for users to input text and see the encrypted result instantly.
- **Learning Opportunity**: This project is a great way to practice JavaFX, string manipulation, and event-driven programming.

### **Program Overview**
- The program takes user input and applies a set of encryption rules to transform the text.
- The encrypted message is displayed in the GUI, making it easy to see the results instantly.

---


### **Encryption Rules**
The program uses the following rules to encrypt the text:

1. **Uppercase Letters (A-M)**:
   - Converted to lowercase.
   - Example: `A` → `a`, `L` → `l`.

2. **Uppercase Letters (N-Z)**:
   - Replaced with `$` followed by a number (0-12).
   - Example: `N` → `$0`, `O` → `$1`, `Z` → `$12`.

3. **Lowercase Letters (a-m)**:
   - Replaced with `*`, `^`, or `#` based on divisibility rules:
     - If divisible by 3: `*`
     - If remainder 1 when divided by 3: `^`
     - If remainder 2 when divided by 3: `#`
   - Example: `a` → `*`, `b` → `^`, `c` → `#`.

4. **Lowercase Letters (n-z)**:
   - Shifted forward in the alphabet by the length of the input string.
   - If the shift goes beyond `z`, it wraps around to the beginning of the alphabet.
   - Example: For a 5-letter input, `n` → `s`, `y` → `d`.

5. **Non-Alphabetic Characters**:
   - Remain unchanged.
   - Example: `!`, ` ` (space), `1`, etc.

---

## Example
Input: `This TExT is a-TESt`  
Output: `$6#*l $6eq$6 *l ^-$6e$5m`

## Screenshots
Here’s what the program looks like in action:

### Initial Launch
![Initial Launch](https://github.com/BitByBit-05/Text_Cipher/blob/main/Initial.png?raw=true)

### After Encryption
| Example 1 | Example 2 |
|---------|---------|
| ![Image 1](https://github.com/BitByBit-05/Text_Cipher/blob/main/Output1.png?raw=true) | ![Image 2](https://github.com/BitByBit-05/Text_Cipher/blob/main/Output2.png?raw=true) |

---

## Try It Yourself
1. Clone the repository.
2. Run the `TextCipher.java` file.
3. Enter your message and watch it transform into a secret code!

---
