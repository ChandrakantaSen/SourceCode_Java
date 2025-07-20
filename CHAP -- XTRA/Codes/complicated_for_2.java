import java.io.*;
class complicated_for_2
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n, i;
int s=0;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
 s=s+((i+(i+1))/(i+(i+1)));

}
System.out.println(s);
}
}