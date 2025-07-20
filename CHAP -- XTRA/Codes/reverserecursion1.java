import java.io.*;
class reverserecursion1
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int p=0;
public static void main(String args[])throws IOException
{
int n,c=0;
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
c=rev(n);
System.out.println(c);
    }
static int rev(int k)
{
if(k==0)
return p;
    else
    {
            p=p*10+k%10;
    return (rev(k/10));
    }
}
    }