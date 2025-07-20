import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        int[] frequency = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                frequency[ch - 65]++;
            }
        }
        System.out.println("Characters Frequency");
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0) {
                System.out.println((char) (i + 65) + "\t" + frequency[i]);
            }
        }
    }
}
