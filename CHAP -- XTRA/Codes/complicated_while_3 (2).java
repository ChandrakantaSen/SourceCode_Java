import java.io.*;
class complicated_while_3
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double n, i=1;
double s=0;
System.out.println("Enter the range:");
n=Double.parseDouble(buf.readLine());

while(i<=n)
{
 s=s+(i+Math.pow((i+1),(i+1)));
i++;
}
System.out.println(s);
}
}