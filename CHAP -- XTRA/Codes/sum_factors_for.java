import java.io.*;
class sum_factors_for
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find the sum of its factors :");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
s=s+i;
System.out.println("the factors are ="+i);
}
}
System.out.println("The sum of factors is =  : "+s);

}
}