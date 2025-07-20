import java.io.*;
class add_even_for
{
public static void main(String args[])throws IOException
{
int i,s=0;
int n;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range:");
 n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
if(i%2==0)
{
s=s+i;
}


}
System.out.println(s);
}
}