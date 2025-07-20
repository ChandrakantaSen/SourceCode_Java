import java.io.*;
public class p
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,i,j,c=0;
System.out.println("Enter the no to find out its nearest prime no");
n=Integer.parseInt(br.readLine());
for(i=n;i>1;i--)
{
for(j=1;j<n;j++)
{
if(i%j==0)
{
c++;

if(c==2)
{
break;
}
System.out.println("The nearest prime no is");
System.out.println(i);
}
}
}
}
}