import java.io.*;
class add_odd_dowhile
{
public static void main(String args[])throws IOException
{
int i=1,s=0;
int n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range:");
 n=Integer.parseInt(buf.readLine());
do
{
if(i%2==1)
{
s=s+i;
}
i++;

}
while(i<=n);
System.out.println(s);
}
}