import java.util.*;
class Tribonacci
{
    int tribo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else if(n==3)
        return 1;
        else
        return tribo(n-1)+tribo(n-2)+tribo(n-3);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Tribonacci ob=new Tribonacci();
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println("The required series is as follows :");
        for(int i=1;i<=n;i++)
        {
            System.out.println(ob.tribo(i));
        }
    }
}