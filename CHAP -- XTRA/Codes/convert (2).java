import java.util.Scanner;
public class convert 
{
   public static void convert() 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.next();
        input = input.toLowerCase();
        String answer = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                answer = answer + (char) (c + 1);
            } else {
                answer = answer + c;
            }
        }
        System.out.println(answer);
    }
}
