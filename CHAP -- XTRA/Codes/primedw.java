import java.io.*;
class primedw   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
i=1;
System.out.println("Enter the number to find whether it is a prime number or not");
n=Integer.parseInt(br.readLine());
do
{
if(n%i==0)
{
c++;
    }
    i++;
}
while(i<=n);
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