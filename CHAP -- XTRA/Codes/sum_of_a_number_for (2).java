import java.io.*;
class sum_of_a_number_for
{
public static void main(String args[])throws IOException
{
int m,n,d,sum=0;
BufferedReader buf=new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the no. to find the sum of the digits of that number:");
n=Integer.parseInt(buf.readLine());
m=n;
for(;m>0;m=m/10)
{
 d=m%10;
sum=sum+d;

}
System.out.println("the sum of the digits of a number is = "+sum);
}
}