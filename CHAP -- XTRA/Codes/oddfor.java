import java.io.*;
class oddfor
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(i%2!=0)
{
s=s+i;
    }
}
System.out.println("The sum of the odd no. is"+s);
    }
}
