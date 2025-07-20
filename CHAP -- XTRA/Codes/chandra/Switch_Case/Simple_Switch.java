
package Switch_Case;
import java.util.*;

class Simple_Switch     
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Menu Driven Program ****");
        System.out.println("Press 1: Addition");
        System.out.println("Press 2: Subtraction");
        System.out.println("Press 3: Multiplication");
        System.out.println("******************************");
        System.out.println();
        System.out.print("Enter the choice: ");
        ch = sc.nextInt();
        System.out.println();
        switch(ch)
        {
            case 1: 
                    int a,b,c;
                    System.out.println("Enter number1: ");
                    a = sc.nextInt();
                    System.out.println("Enter number2: ");
                    b = sc.nextInt();
                    
                    c=(a+b);
                    System.out.println("Sum is: "+c);
            break;
            case 2: 
                    int d,e,f;
                    System.out.println("Enter number1: ");
                    d = sc.nextInt();
                    System.out.println("Enter number2: ");
                    e = sc.nextInt();
                    
                    f=(d-e);
                    System.out.println("Difference is: "+f);
            break;
            case 3: 
                    int m,n,p;
                    System.out.println("Enter number1: ");
                    m = sc.nextInt();
                    System.out.println("Enter number2: ");
                    n = sc.nextInt();
                    
                    p=(m*n);
                    System.out.println("Multiplication is: "+p);
            break;
            default:
                    System.out.println("Wrong Choice...!");
        }
    }
}