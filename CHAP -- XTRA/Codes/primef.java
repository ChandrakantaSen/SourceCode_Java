import java.io.*;
class primef   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
System.out.println("Enter the number to find whether it is a prime number or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
    }
}
if(c==2)
{
System.out.println(n+"is a prime number");
    }
    else
    {
     System.out.println(n+"is not a prime number"); 
    }
    }
}