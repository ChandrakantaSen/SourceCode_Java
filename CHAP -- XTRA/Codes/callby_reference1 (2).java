import java.io.*;
class callby_reference1
{
static void pal(int n)
{
int a=n,c=0;
while(n>0)
{
int b=n%10;
c=c*10+b;
n=n/10;
    }
    if(c==a)
    System.out.println("is palindrome");
    else
     System.out.println("not palindrome");
    }
static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the no.");
        int n=Integer.parseInt(br.readLine());
        pal(n);
    }
}    

