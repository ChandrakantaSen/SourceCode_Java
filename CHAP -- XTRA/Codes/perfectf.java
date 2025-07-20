import java.io.*;
class perfectf   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,s=0;
System.out.println("Enter the number to find whether it is a perfect number or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
    }
}
if(s==n)
{
System.out.println(n+"is a perfect number");
    }
    else
    {
        System.out.println(n+"is not a perfect number");
    }
    }
}