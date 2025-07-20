import java.io.*;
class dowhile2
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.println("Enter the range:");
n=Integer.parseInt(buf.readLine());
int i=10;
do
{
System.out.println(i);
i--;
}
while(i>=n);
}
}