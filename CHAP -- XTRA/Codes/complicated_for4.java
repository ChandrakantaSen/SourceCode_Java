import java.io.*;
class complicated_for4
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double n, i;
double s=0;
System.out.println("Enter the range:");
n=Double.parseDouble(buf.readLine());
for(i=1;i<=n;i++)
{
 s=s+(Math.pow(i,i));

}
System.out.println(s);
}
}