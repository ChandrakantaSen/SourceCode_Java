import java.io.*;
class callbyvaluepalindrome
{
static void palindrome(int n)
{
int copy=n,a=0;
while(n>0)
{
a=a*10+(n%10);
n=n/10;
    }
if(a==copy)
System.out.print("palindrome");
else
System.out.print("not palindrome");
    }
static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("ENTER NUMBER");
 int n=Integer.parseInt(br.readLine());
 palindrome(n);
    }
}


    

 
