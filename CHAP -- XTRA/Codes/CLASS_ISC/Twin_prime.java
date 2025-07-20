import java.util.*;
class Twin_prime
{
    int a,b;
    Twin_prime()
    {
        a=0;
        b=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers to be checked :");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    int twin(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return 0;
        }
        return 1;
    }
    void display()
    {
        if((Math.abs(a-b)==2)&&(twin(a)==1)&&(twin(b)==1))
        System.out.println(a+" and "+b+" are twin primes");
        else
        System.out.println(a+" and "+b+" are not twin primes");
    }
    public static void main()
    {
        Twin_prime ob=new Twin_prime();
        ob.input();
        ob.display();
    }
}