import java.io.*;
class for_SON
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n, i;
int s=0;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
for(i=0;i<=n;i++)
{
 s=s+i;

}
System.out.println(s);
}
}