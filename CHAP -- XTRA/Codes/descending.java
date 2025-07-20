import java.io.*;
public class descending
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,i,d,m;
System.out.println("Enter the number");
n=Integer.parseInt(br.readLine());
for(i=9;i>=0;i--)
{
m=n;
while(m>0)
{
d=m%10;
if(d==i)
{
System.out.print(d);
}
m=m/10;
}
}
}
}