import java.io.*;
class perfectrecursion1
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int p=0,i=1;
public static void main(String args[])throws IOException
{
int n,c=0;
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
c=perfect(n);
if(c==n)
{
System.out.println(n+" is a perfect number ");
    }
    else
{
System.out.println(n+" is a not perfect number ");
    }    
    }
static int perfect(int k)
{
if(i==k)
return p;
    else
    {
    if(k%i==0)
    {
     p=p+i;
    }
    i++;
    return perfect(k);
    }
}
    }