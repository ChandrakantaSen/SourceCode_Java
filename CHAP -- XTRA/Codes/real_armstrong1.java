import java.io.*;
class real_armstrong1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m;
double d,s=0,c=0;
System.out.println("Enter the number to check whether it is real_arm or not");
n=Integer.parseInt(br.readLine());
m=n;
do
{
c++;
m=m/10;
    }
    while(m>0);
   m=n;
do
   {
       d=m%10;
       s=s+(Math.pow(d,c));
       m=m/10;
    }
    while(m>0);
    if((int)(s)==n)
    {
     System.out.println(n+"is a real_armstrong number");
    }
    else
    {
         System.out.println(n+"is not a real_armstrong number");
    }
}
}