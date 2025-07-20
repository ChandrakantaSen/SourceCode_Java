import java.util.*;

class factorial_rec
{
    static int fact(int n)
    {
        int p;
        if(n==0)
        {
            return 1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }

    static void main()
    {
        int num,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();

        s = fact(num);
        System.out.println("Factorial of a number is: "+s);
    }
}