import java.io.*;
class sumoffact_fl
{
public static void main(String args[])throws IOException
{
 int n,i,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to count its factors");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
System.out.println("The sum of factors of the entered number are "+s);
}
}

