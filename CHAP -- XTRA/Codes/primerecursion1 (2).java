import java.io.*;
class primerecursion
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int p=0,i=1;
public static void main(String args[])throws IOException
{
int n,c=0;
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
c=prime(n);
if(c==2)
{
System.out.println(n+" is a prime number ");
    }
    else
{
System.out.println(n+" is a not prime number ");
    }    
    }
static int prime(int k)
{
if(i>k)
{
return p;    
}
else
    {
    if(k%i==0)
    {
        p++;
    }
    i++;
    return prime(k);
    }
}
    }