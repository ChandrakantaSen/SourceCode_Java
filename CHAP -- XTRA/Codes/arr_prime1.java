import java.io.*;
class arr_prime1
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int n,i,j,count;
public static int prime(int p)
{
count=0;
for(j=1;j<=p;j++)
{
if(p%j==0)
{
count++;
}
}
if(count==2)
{
return 1;
}
else 
{
return 0;
    }
    }
public static void main(String args[])throws IOException
{
System.out.println("Enter the size of the array:");
n=Integer.parseInt(br.readLine());
if(prime(n)==1)
{
System.out.println(n+" is a prime number . ");
   }
   else
   {
       System.out.println(n+" is not a prime number . ");
    }
}
}

