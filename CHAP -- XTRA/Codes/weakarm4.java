import java.io.*;
class weakarm4   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m;
double d,s=0,c=0;
System.out.println("Enter the number to check whether it is weakarm or not");
n=Integer.parseInt(br.readLine());
m=n;
do
{
c++;
m=m/10;
    }
    while(m>0);
   m=n;
   while(m>0)
   {
       d=m%10;
       s=s+(Math.pow(d,c));
       m=m/10;
       c--;
    }
    if((int)(s)==n)
    {
     System.out.println(n+"is a weakarm number");
    }
    else
    {
         System.out.println(n+"is not a weakarm number");
    }
}
}