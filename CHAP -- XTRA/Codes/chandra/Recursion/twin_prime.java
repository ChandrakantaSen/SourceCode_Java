import java.util.*;
class twin_prime
{  
    public static void main()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter lower range");
         int m=sc.nextInt();
         System.out.println("Enter upper range");
         int n=sc.nextInt();
         twin_prime obj=new twin_prime();
         boolean p=false;
         for(int i=m;i<=n-2;i++)
         {
             
             if(obj.prime(i)==true && obj.prime(i+2)==true)
             {
                 System.out.println(i+","+(i+2));
             }     
         }
    } 
    boolean prime(int n)
    {
        int i,c=0,d=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        
        return true;
        else 
        return false;
    }
}
        
       
   