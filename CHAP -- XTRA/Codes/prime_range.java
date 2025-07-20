import java.io.*;
class prime_range
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,j,c,i;
System.out.println("Enter the number to check wheather the number is prime number or not : -");
n=Integer.parseInt(br.readLine());
System.out.println("The prime no. upto "+n+"are as follows");
for(i=1;i<=n;i++)
{
c=0;
for(j=1;j<=i;j++)
{
if (i%j==0)
{
c++;
    }
} 
if(c==2)
{
System.out.println(i);
    }
}
    }
}