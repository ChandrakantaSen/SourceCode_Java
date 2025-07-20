import java.io.*;
class loop_range
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,s=0;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
s=s+i;
}
System.out.println("The sum of the given range is"+s);
}
}

