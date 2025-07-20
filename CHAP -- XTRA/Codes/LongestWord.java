import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        int longest = 0;
        int currentWordLength = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                if (currentWordLength > longest) {
                    longest = currentWordLength;
                }
                currentWordLength = 0;
            } else {
                currentWordLength++;
            }
        }
        if (currentWordLength > longest) {
            longest = currentWordLength;
        }
        System.out.println("The longest word has " + longest + " characters");
    }
}
