import java.util.*;
class number222
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,n,a,i,c=0;
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("enter a digit");
        a=in.nextInt();
        while(n>0)
        {
        r=(n%10);
        n=(n/10);
        if(r==a)
        c=c+1;
       }
 System.out.println(" "+c);
}
}

        
         
       
                
            
        
        
