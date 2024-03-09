public class CaesarCipher {

    public static String encrypt(String message, int shift) {

    // Convert message to uppercase
    message = message.toUpperCase(); 

    // Initialize empty string for encrypted message
    String encryptedMessage = ""; 

    // Encrypt each letter in the message
    for (int i = 0; i < message.length(); i++) {
    char c = message.charAt(i); 

    // If the character is a letter, encrypt it
    if (Character.isLetter(c)) {
    char shifted = (char) (((c - 'A' + shift) % 26) + 'A');
    encryptedMessage += shifted;
    } else {
    encryptedMessage += c;
    }
    } 
    return encryptedMessage;
    } 

    public static String decrypt(String message, int shift) {

    // Convert message to uppercase
    message = message.toUpperCase(); 

    // Initialize empty string for decrypted message
    String decryptedMessage = ""; 

    // Decrypt each letter in the message
    for (int i = 0; i < message.length(); i++) {
    char c = message.charAt(i); 

    // If the character is a letter, decrypt it
    if (Character.isLetter(c)) {
    char shifted = (char) (((c - 'A' - shift + 26) % 26) + 'A');
    decryptedMessage += shifted;
    } 
    else {
    decryptedMessage += c;
    }
    
    } 
    return decryptedMessage;
    } 

    public static void main(String[] args) {
    String message = "NATNAEL";
    int shift = 3; 

    // Encrypt message
    String encryptedMessage = encrypt(message, shift);
    System.out.println("Encrypted message: " + encryptedMessage); 

    // Decrypt message
    String decryptedMessage = decrypt(encryptedMessage, shift);
    System.out.println("Decrypted message: " + decryptedMessage);
    }
   }