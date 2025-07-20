import java.util.*;
class sum_odd
{
    static int sum(int n)
    {
        int p;
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return (n+sum(n-2));
        }
    }
    static void main()
    {
        int num,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        
        s = sum(num);
        System.out.println("Sum of digit is: "+s);
    }
}