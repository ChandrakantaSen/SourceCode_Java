import java.io.*;                /* FIND THE SUM OF DIGITS OF THE ENTERED NUMBER*/
class asum_dowl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find the sum of its digits");
n=Integer.parseInt(br.readLine());
m=n;
do
{
d=m%10;
s=s+d;
m=m/10;
}
while(m>0);
System.out.println("The sum of the digits of the entered number is "+s);
}
}

