import java.io.*;
class forS
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
System.out.println("Enter the range : - ");
for(i=1;i<=n;i++)
{
s=s+(i*i);
    }
System.out.println("The sum of the series is "+n+" is : - "+s);
}
    }
    