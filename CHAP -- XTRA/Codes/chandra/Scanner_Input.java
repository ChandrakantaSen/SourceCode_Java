import java.util.*;

class Scanner_Input
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter number1: ");
        a = sc.nextInt();
        System.out.println("enter number2: ");
        b = sc.nextInt();
        
        c =(a+b);
        System.out.println("Sum is: "+c);
    }
}