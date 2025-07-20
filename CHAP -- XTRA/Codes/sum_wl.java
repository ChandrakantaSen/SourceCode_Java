import java.io.*;                /* FIND THE SUM OF DIGITS OF THE ENTERED NUMBER*/
class sum_wl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find the sum of its digits");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
}
System.out.println("The sum of the digits of the entered number is "+s);
}
}

