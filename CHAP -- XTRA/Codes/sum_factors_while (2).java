import java.io.*;
class sum_factors_while
{
public static void main(String args[])throws IOException
{
int i=1,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find the sum of its factors :");
n=Integer.parseInt(buf.readLine());
while(i<=n)
{
if(n%i==0)
{
s=s+i;
System.out.println("the factors are ="+i);
}
i++;
}

System.out.println("The sum of factors is =  : "+s);

}
}