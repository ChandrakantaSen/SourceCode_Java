import java.io.*;
class complicated_for3
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double n, i;
double s=0;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
 s=s+(i+Math.pow((i+1),(i+1)));

}
System.out.println(s);
}
}