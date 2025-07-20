import java.util.*;
class Fibonacci
{
    int fibo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of terms :");
        int x=sc.nextInt();
        Fibonacci ob=new Fibonacci();
        System.out.println("The required series is as follows :");
        for(int i=1;i<=x;i++)
        {
            System.out.println(ob.fibo(i));
        }
    }
}