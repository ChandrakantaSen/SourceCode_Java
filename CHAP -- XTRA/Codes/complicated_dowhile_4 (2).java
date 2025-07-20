import java.io.*;
class complicated_dowhile_4

{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double n, i=1;
double s=0;
System.out.println("Enter the range:");
n=Double.parseDouble(buf.readLine());
do
{
 s=s+Math.pow(i,i);
i++;
}
while(i<=n);
System.out.println(s);
}
}