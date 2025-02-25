# INS_LAB - Cryptographic Ciphers

This repository contains Java and Python implementations of various classical cryptographic ciphers. These ciphers are fundamental in understanding how encryption techniques evolved over time.

## Implemented Ciphers

- **Caesar Cipher** - A simple substitution cipher that shifts characters by a fixed number of positions in the alphabet.
- **Monoalphabetic Cipher** - A substitution cipher where each letter in the plaintext is replaced with a corresponding letter from a fixed shuffled alphabet.
- **Playfair Cipher** - A digraph substitution cipher that encrypts pairs of letters using a 5x5 matrix.
- **Hill Cipher** - A polygraphic substitution cipher based on matrix multiplication.
- **Vigenère Cipher** - A polyalphabetic substitution cipher that encrypts text using a repeating keyword-based shifting technique.
- **Feistel Cipher** - A symmetric encryption algorithm that splits plaintext into two halves and applies multiple rounds using XOR operations and a key. It forms the basis of modern block ciphers like DES.

# Prerequisites
Ensure you have Java installed on your system. You can check by running:

```java -version```

If Java is not installed, download and install it from oracle.com or OpenJDK.

# Running the Programs
Each cipher program is a standalone Java class. Follow these steps to run them:

1.Clone the repository
```
https://github.com/Aditya-rao-1/INS_LAB
cd your-repo-name
```
2.Compile and run a specific cipher

ceaser 
```
javac CaesarCipher.java
java CaesarCipher
```
monoalphabetic
```
javac MonoalphabeticCipher.java
java MonoalphabeticCipher
```
playfair
```
python playfair_cipher.py
```
hillcipher
```
javac HillCipher.java
java HillCipher
```
vigenere
```
javac HillCipher.java
java HillCipher
```
feistal
```
python feistal.py
```

Follow the on-screen instructions to encrypt or decrypt messages using the respective ciphers.
