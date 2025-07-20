import java.util.*;
class greatest10
{
    public static void main(String args[])
    {
        int n,a,b,c,max=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the ten numbers");
        for(a=1;a<=10;a++)
        {
         n=in.nextInt(); 
         if(max<n)
         {
             max=n;
            }
        }
        System.out.println("greatest number is"+max);
    }
}
        
        
        
        