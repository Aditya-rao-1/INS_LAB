import tinyec
from tinyec import registry
import secrets

curve = registry.get_curve("brainpoolP256r1")

def compress_point(point):
    return hex(point.x) + hex(point.y % 2)[2:]

def getEnKey(pubKey):
    ciPrivateKey = secrets.randbelow(curve.field.n)
    ciPublicKey = ciPrivateKey * curve.g
    enKey = ciPublicKey * ciPrivateKey
    return (enKey, ciPublicKey)

# Sender's key pair
senderPrivateKey = secrets.randbelow(curve.field.n)
senderPublicKey = senderPrivateKey * curve.g

print("Sender's private key:", hex(senderPrivateKey))
print("Sender's public key:", compress_point(senderPublicKey))
print("\n")

# Sender's encryption key
(enKeySender, ciPublicKeySender) = getEnKey(senderPublicKey)
print("Sender's ciphertext public key:", compress_point(ciPublicKeySender))
print("Sender's encryption key:", compress_point(enKeySender))
print("\n")

# Receiver's key pair
receiverPrivateKey = secrets.randbelow(curve.field.n)
receiverPublicKey = receiverPrivateKey * curve.g

print("Receiver's private key:", hex(receiverPrivateKey))
print("Receiver's public key:", compress_point(receiverPublicKey))
print("\n")

# Receiver's encryption key
(enKeyReceiver, ciPublicKeyReceiver) = getEnKey(receiverPublicKey)
print("Receiver's ciphertext public key:", compress_point(ciPublicKeyReceiver))
print("Receiver encryption key:", compress_point(enKeyReceiver))
