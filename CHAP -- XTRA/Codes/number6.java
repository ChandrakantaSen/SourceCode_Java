import java.util.*;
class number6
{
    public static void main(String args[])
    {
        int n,i,even=0,odd=0;
        Scanner in=new Scanner(System.in);
        for(i=1;i<=10;i++)
        {
            System.out.println("enter the numbers");
            n=in.nextInt();
            if(n%2==0)
            even=even+n;
            else
            odd=odd+n;
        }
        System.out.println("even numbers are"+even);
        System.out.println("oddd numbers are"+odd);
        }
}
        
            
        
        
