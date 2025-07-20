import java.io.*;
class prime12
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int n,i,j,count;
public static void prime()throws IOException
{
System.out.println("Enter the number :");
n=Integer.parseInt(br.readLine());
count=0;
for(j=1;j<=n;j++)
{
if(n%j==0)
{
count++;
}
}
if(count==2)
{
System.out.println(n+" is a prime number . ");
}
else 
{
       System.out.println(n+" is not a prime number . ");
    }
    }
public static void main(String args[])throws IOException
{
prime();
}
}

