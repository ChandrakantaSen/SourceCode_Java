import java.util.*;
class prime_Constructor
{
    int flag,n;
    prime_Constructor()
    {
        System.out.print("Enter range to find the prime numbers:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(int i=2;i<n;i++)
        {
            flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j ==0)
                    flag++;
            }
            if(flag==0)
                System.out.print(" "+ i);
        }
    }
    public static void main(String a[])   
    {
        prime_Constructor obj = new prime_Constructor();
    }
}