/* import the Scanner class */
import java.util.Scanner;

/** demonstrate how to read from System.in */
class scanner1
 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your Zodiac sign: ");
        String zodiac = scanner.next();
        
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your lucky number: ");
        int luckyNum = scanner.nextInt();
        
        System.out.println("Hello, " + name + ".");
        System.out.println("Your lucky number is  " + luckyNum + ".");
        System.out.println("Your weighy " + weight + " kg.");
        System.out.println("Your Zodiac sign is " + zodiac + ".");
    }
}