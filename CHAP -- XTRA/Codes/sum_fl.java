import java.io.*;                /* FIND THE SUM OF DIGITS OF THE ENTERED NUMBER*/
class sum_fl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find the sum of its digits");
n=Integer.parseInt(br.readLine());
for(m=n;m>0;m=m/10)
{
d=m%10;
s=s+d;
}
System.out.println("The sum of the digits of the entered number is "+s);
}
}

