import java.io.*;               
class armstrong_wl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to check whetherit is an armstrong number or not");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s+(d*d*d);
}
if(s==n)
{
System.out.println(s+"is an armstrong number");
}
else
{
System.out.println(s+"is not an armstrong number");
}
}
}