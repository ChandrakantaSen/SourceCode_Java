import java.io.*;
public class ascending
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,i,d,m;
System.out.println("Enter the number");
n=Integer.parseInt(br.readLine());
for(i=0;i<9;i++)
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