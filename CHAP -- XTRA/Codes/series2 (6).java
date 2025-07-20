import java.util.Scanner;
 
public class series2 {
 
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //System.out.println();
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printPattern(n);
    }
 
}