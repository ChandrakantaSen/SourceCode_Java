import java.util.*;
class series8
{
    public static void main(String args[])
    {
        int i,n,a,j;
        double s=0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("enter the value of a");
        a=in.nextInt();
        j=3;
       for(i=1;i<=n;i++)
        {
            
                s=(double)(a+i)/j;
                j=j+2;
                
            }
        
        System.out.println(" "+s);
    }
    }

                
        
