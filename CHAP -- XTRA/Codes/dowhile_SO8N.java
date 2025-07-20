import java.io.*;
class dowhile_SO8N
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n, i=0;
int s=0;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
do
{
s=s+(i*i*i*i*i*i*i*i);
i++;
}
while(i<=n);
System.out.println(+s);
}
}