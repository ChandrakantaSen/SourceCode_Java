import java.io.*;               
class armstrong_nwl
{
public static void main(String args[])throws IOException
{
 int i,n,m,d,s;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to check whetherit is an armstrong number or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
s=0;m=i;
while(m>0)
{
d=m%10;
s=s+(d*d*d);
}
if(s==i)
{
System.out.println(i);
}
}
}
}
