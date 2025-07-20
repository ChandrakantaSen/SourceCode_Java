import java.io.*;
class fact
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

double n, fact=1;
System.out.println(" enter any number:");

n=Integer.parseInt(br.readLine());
if(n>=0)
{
while(n>1)
{
fact=fact*n;
n=n-1;
    }
    System.out.println(" factorial is"+'\t'+fact);
}
else
{
System.out.println(" number must be greater than zero");
    }
}
    }
    
