import java.util.*;
class sum_of_digit
{
    static int digit(int n)
    {
        int p;
        if(n==0)
        {
            return 0;
        }
        else
        {
            p=n;
            n=n%10;
            return (n+digit(p/10));
        }
    }
    static void main()
    {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        
        sum = digit(num);
        System.out.println("Sum of digit is: "+sum);
    }
}