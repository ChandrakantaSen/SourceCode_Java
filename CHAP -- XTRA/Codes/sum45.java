import java.util.*;
class sum45
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,n,sum=0;
        System.out.println("the number is");
        n=in.nextInt();
        while(n>0)
        {
            r=(n%10);
            n=(n/10);
            sum=sum+r;
            
        }
        System.out.println("sum is"+sum);
    }
}

        
        
    
