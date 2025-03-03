INS_LAB - Cryptographic Ciphers

This repository contains Java and Python implementations of various classical cryptographic ciphers. These ciphers illustrate the evolution of encryption techniques and serve as a foundation for understanding modern cryptography.

Implemented Ciphers

1. Caesar Cipher

A simple substitution cipher that shifts characters by a fixed number of positions in the alphabet.

2. Monoalphabetic Cipher

A substitution cipher where each letter in the plaintext is replaced with a corresponding letter from a shuffled alphabet.

3. Playfair Cipher

A digraph substitution cipher that encrypts pairs of letters using a 5x5 matrix. It eliminates repeated letters and simplifies frequency analysis attacks.

4. Hill Cipher

A polygraphic cipher that uses matrix multiplication to encrypt blocks of plaintext. It is more secure compared to simple substitution ciphers.

5. Vigenère Cipher

A polyalphabetic cipher utilizing a keyword-based shifting technique. It provides more security against frequency analysis.

6. Feistel Cipher

A symmetric encryption algorithm that splits plaintext into two halves and applies multiple rounds of encryption using XOR operations and a key. It forms the basis of modern block ciphers like DES (Data Encryption Standard).

How It Works

Each cipher is implemented as a standalone module demonstrating:

Encryption Process

Decryption Process

Sample Inputs and Outputs

Explanation of the Cipher Algorithm

The code is designed for educational purposes and helps understand cryptographic principles in an easy-to-follow manner.
