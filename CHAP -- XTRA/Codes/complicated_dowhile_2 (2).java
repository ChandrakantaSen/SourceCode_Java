import java.io.*;
class complicated_dowhile_2
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n, i=1;
int s=0;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
do
{
 s=s+((i+(i+1))/(i+(i+1)));
i++;
}
while(i<=n);
System.out.println(s);
}
}