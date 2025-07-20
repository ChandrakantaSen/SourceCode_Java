import java.io.*;
class palindromerecursion1
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int p=0;
public static void main(String args[])throws IOException
{
int n,c=0;
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
c=rev(n);
if(c==n)
{
System.out.println(n+" is a palindrome number .");
    }
    else
    {
System.out.println(n+" is not a palindrome number .");
    }
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