
/*      Assingment 4 - CaeserCipher.java          */

    package caesercipher;
    import java.util.*;
    public class CaeserCipher {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String encryptOption;
    //Prompt user to encrypt or decrypt
    System.out.print("Would you like to (e)ncrypt or (d)ecrypt? ");
    encryptOption = keyboard.nextLine();
    String originalText;
    int shiftValue;
    //User chooses to encrypt original text
    if (encryptOption.equalsIgnoreCase("e")){
    System.out.println("What text would you like to encrypt?");
    originalText = keyboard.nextLine();
    //Prompt user for shift value
    System.out.print("\nWhat is the shift value? ");
    shiftValue = keyboard.nextInt();
    //Return encrypted string
    String encryptedText = encrypt(originalText , shiftValue);
    //Print result to user
    System.out.println("\nThe encrypted text is:\n" + encryptedText);
    }
    //User chooses to decrypt original text
    else if (encryptOption.equalsIgnoreCase("d")){
    System.out.println("What text would you like to decrypt?");
    originalText = keyboard.nextLine();
    //Prompt user for shift value
    System.out.print("\nWhat is the shift value? ");
    shiftValue = keyboard.nextInt();
    //Return decrypted string
    String decryptedText = decrypt(originalText , shiftValue);
    //Print result to user
    System.out.println("\nThe decrypted text is:\n" + decryptedText);
    }
    }
    //rotate and change chars
    public static String rotate(String userString, int shiftValue) {
    String convertedText = "";
    for(int i = 0; i < userString.length(); i++){
    char lowerLetter = userString.charAt(i);
    //Convert to uppercase
    char upperLetter = Character.toUpperCase(lowerLetter);
    int charNumber = upperLetter;
    //Apply shift, remembering to wrap text
    int rotateShift = (charNumber + shiftValue) % 26;
    char shiftLetter = (char) rotateShift;
    //Create new string of shifted chars
    convertedText += shiftLetter;
    }
    return convertedText;
    }
    //encrypt
    public static String encrypt(String userString, int shiftValue) {
    String encryptedString = rotate(userString , shiftValue);
    return encryptedString;
    }
    public static String decrypt(String userString, int shiftValue) {
    int negativeShiftValue = (-1) * (shiftValue);
    String decryptedString = rotate(userString , negativeShiftValue);
    return decryptedString;
    }
    }