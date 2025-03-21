# 🔐 INS_LAB - Cryptographic Ciphers

Welcome to **INS_LAB**, a comprehensive collection of classical cryptographic ciphers implemented in **Java** and **Python**. This repository serves as a gateway to understanding the evolution of encryption techniques, laying the foundation for modern cryptography.

## 🚀 Implemented Ciphers
Dive into the world of cryptography with the following cipher implementations:

### 1. Caesar Cipher
🔑 A beginner-friendly **substitution cipher** that shifts each letter in the plaintext by a fixed number of positions.
- Simple yet effective
- Easy to crack with frequency analysis

### 2. Monoalphabetic Cipher
🔄 A **substitution cipher** where each letter is replaced by a unique corresponding letter from a shuffled alphabet.
- Stronger than Caesar Cipher
- Vulnerable to frequency analysis

### 3. Playfair Cipher
🎲 A **digraph substitution cipher** encrypting pairs of letters using a 5x5 matrix.
- Eliminates repeated letters
- More secure than simple substitution ciphers

### 4. Hill Cipher
📊 A **polygraphic cipher** that uses matrix multiplication to encrypt plaintext blocks.
- Uses linear algebra concepts
- Offers better security than single-letter ciphers

### 5. Vigenère Cipher
🔑✨ A **polyalphabetic cipher** employing a keyword-based shifting technique.
- Resists frequency analysis
- One of the most famous classical ciphers

### 6. Feistel Cipher
🔐 A **symmetric encryption algorithm** splitting plaintext into two halves and applying multiple rounds of encryption.
- Forms the basis of modern block ciphers like **DES**
- Provides high security with multiple rounds

### 7. DES Algorithm
💪 The **Data Encryption Standard (DES)** is a symmetric key algorithm that applies the Feistel structure with 16 rounds of encryption.
- Uses 64-bit blocks with a 56-bit key
- Widely used in the past for secure data encryption
- Demonstrates the power of symmetric encryption

### 8. RSA Algorithm
🔑 The **Rivest-Shamir-Adleman (RSA)** algorithm is an asymmetric encryption method relying on the difficulty of prime factorization.
- Uses public and private keys for encryption and decryption
- Ensures secure communication over unsecured channels
- Widely used in modern security protocols

### 9. Diffie-Hellman Key Exchange
🔄 The **Diffie-Hellman** key exchange protocol enables secure key sharing over an insecure channel.
- Establishes a shared secret between two parties
- Foundation of many cryptographic protocols
- Used in secure communications and SSL/TLS

### 10. Elliptic Curve Cryptography (ECC)
📈 **ECC** is a public-key encryption technique based on the mathematics of elliptic curves.
- Provides high security with smaller key sizes
- Used in modern cryptographic applications, including Bitcoin and secure messaging
- More efficient than traditional RSA encryption

---

## 🔍 How It Works
Each cipher module demonstrates:
- 📌 Encryption Process
- 🔓 Decryption Process
- 📝 Sample Inputs and Outputs
- 📄 Explanation of the Cipher Algorithm

The code is designed for **educational purposes**, making cryptographic principles easy to follow and understand.

---

## 💡 Why This Repository?
- Learn classical ciphers hands-on
- Understand the fundamentals of cryptography
- Get a head start in modern encryption techniques

## 📌 Installation
1. Clone the repository:
```bash
https://github.com/Aditya-rao-1/INS_LAB.git
```
2. Navigate to the directory:
```bash
cd INS_LAB
```
3. Run the code with your preferred language:
- Python: `python cipher.py`
- Java: `javac Cipher.java && java Cipher`

---

## 🤝 Contributing
Pull requests are welcome! Feel free to improve the code or add more ciphers.


