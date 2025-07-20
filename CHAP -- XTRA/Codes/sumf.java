import java.io.*;
class sumf   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,s=0;
System.out.println("Enter the number to find the sum of its factor");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
s=s+i;
    }
}
System.out.println("The sum of factors of the number"+n+"is"+s);
    }
}