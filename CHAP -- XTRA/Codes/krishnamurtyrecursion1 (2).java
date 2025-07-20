import java.io.*;
class krishnamurtyrecursion1
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int p=0;
public static void main(String args[])throws IOException
{
int n,c=0;
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
c=kris(n);
if(c==n)
{
System.out.println(n+" is a krishnamurty number .");
    }
    else
    {
System.out.println(n+" is not a krishnamurty number .");
    }
    }
static int kris(int k)
{
if(k==0)
return 0;
    else
    {
    return fact(k%10)+kris(k/10);
    }
}
 static int fact(int s)
{
if(s==0)
return 1;
    else
    {
        return s*fact(s-1);
    }
}   }