import java.util.*;
class factorial
{
    public static void main(String args[])
    {
     int i,n,f=1;
     Scanner in=new Scanner(System.in);
     System.out.println("enter the number");
     n=in.nextInt();
     for(i=1;i<=n;i++)
     {
         f=f*i;
        }
             System.out.println("factorial is"+f);
            }
        }
         
    
