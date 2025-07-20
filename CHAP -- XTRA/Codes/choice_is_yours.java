import java.io.*;
class choice_is_yours
{
public static void main(String args[])throws IOException
{
BufferedReader rashmi=new BufferedReader(new InputStreamReader(System.in));
int a,n;
System.out.print("PRESS '1' FOR ARMSTRONG CHEEK");
System.out.print("PRESS '2' FOR KRISHNAMURTI CHEEK");
System.out.print("PRESS '3' FOR MAGIC CHEEK");
 a=Integer.parseInt(rashmi.readLine());
System.out.print("ENTER NUMBER");
n=Integer.parseInt(rashmi.readLine());
switch(a)
{
case 1:int m,copy=n,s=0;
          while(copy>0)
          {
              m=copy%10;
              s=s+m*m*m;
              copy=copy/10;
            }
            if(s==n)
            System.out.print(n+"is an Armstrong number");
            else
            System.out.print(n+"is not an Armstrong number");
            break;
case 2:int f=1;
copy=n;s=0;
       while(copy>0)
            {
            m=copy/10;
            for(int i=1;i<=m;i++)
            f=f*i;
            s=s+f;
            copy=copy/10;
        }
        if(s==n)
     System.out.print(n+"is a krishnamurti number");    
     else
      System.out.print(n+"is not a Krishnamurti number");
      break;
case 3:copy=n;s=0;
       while(copy>0)
    {
        m=copy%10;
       s=s+m;
       copy=copy/10;
    }
    if(s==1)
    System.out.print("magic no.");
    else
   System.out.print("magic no.");
   break;
}
    }
}

            
            
            
              
