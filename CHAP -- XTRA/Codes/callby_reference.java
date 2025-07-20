import java.io.*;
class callby_reference
{
static void armstrong(int n)
{
int a=n,c=0;
while(n>0)
{
int b=n%10;
c=c+(int)Math.pow(b,3);
n=n/10;
    }
    if(c==a)
    System.out.println("is armstrong");
    else
     System.out.println("not armstrong");
    }
static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no.");
        int n=Integer.parseInt(br.readLine());
        armstrong(n);
    }
}    

