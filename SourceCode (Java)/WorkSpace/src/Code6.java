import java.util.Scanner;
public class Code6
{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String s = sc.nextLine();
 // Convert string to uppercase
 String s1 = s.toUpperCase();
 int c = 0;
 for (int i = 0; i < s1.length() - 1; i++) {
 char ch1 = s1.charAt(i);
 char ch2 = s1.charAt(i + 1);

if((ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')&&(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'))
 {
 System.out.println("Found pair OF VOWELS " + ch1 + ch2);
 c++;
 }
 }
 System.out.println("Total pairs = " + c);
 }
} 