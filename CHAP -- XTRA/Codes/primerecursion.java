import java.io.*;
class primerecursion
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int p=0,i=2;
public static void main(String args[])throws IOException
{
int n,c=0;
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
c=prime(n);
if(c==1)
{
System.out.println(n+" is a prime number "+c);
    }
    else
{
System.out.println(n+" is a not prime number "+c);
    }    
    }
static int prime(int k)
{
if(k==i)
{
return 0;
    }
    else
    {
    if(k%i==0)
    {
        p++;
        i=i+1;
    }
    return prime(k);
    }
    //return p;
}
    }