import java.util.*;
class Lucky_number
{
    Scanner sc=new Scanner(System.in);
    int n;
    Lucky_number()
    {
        n=0;
    }
    void input()
    {
        System.out.println("Enter the upper range (must be less than or equal to 50) : ");
        n=sc.nextInt();
    }
    boolean isPrime(int x)
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
    void display()
    {
        int i;
        boolean check=true;
        for(i=1;i<n;i++)
        {
            if(isPrime(i))
            {
                if(check)
                {System.out.println(i);check=false;}
                else
                check=true;
            }
        }
    }
    public static void main()
    {
        Lucky_number ob=new Lucky_number();
        ob.input();
        System.out.println("The lucky numbers in the given range are :");
        ob.display();
    }
}