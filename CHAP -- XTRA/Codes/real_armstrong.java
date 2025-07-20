import java.io.*;
class real_armstrong  
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m;
double d,s=0,c=0;
System.out.println("Enter the number to check whether it is real armstrong or not");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
c++;
m=m/10;
    }
   m=n;
   while(m>0)
   {
       d=m%10;
       s=s+(Math.pow(d,c));
       m=m/10;
    }
    if((int)(s)==n)
    {
     System.out.println(n+"is a real armstrong number");
    }
    else
    {
         System.out.println(n+"is not a real armstrong number");
    }
}
}