import java.util.*;
class twin_prime
{
    static int i,c;
    static int twin(int n)
    {
        c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        return c;
    }
    public static void main()
    {
        int a,b,k1,k2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        k1=twin(a);
        k2=twin(b);
        if((k1==2)&&(k2==2))
        {
            if(((a-b)==2)||(b-a)==2)
            {
                System.out.println("It is a twin prime number");
            }
        }
        else
        {
             System.out.println("It is not a twin prime number");
        }
    }
}