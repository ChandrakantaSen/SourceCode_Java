import java.io.*;
class arr_prime10
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int n,i,j,count;
public static String prime(int p)
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
return "good";/*System.out.println(n+" is a prime number . ");*/
}
else 
{
return "bad";/*       System.out.println(n+" is not a prime number . ");*/
    }
}
public static void main(String args[])throws IOException
{
String k;
System.out.println("Enter the size of the array:");
n=Integer.parseInt(br.readLine());
 k=prime(n);
if (k=="good")
    System.out.println(+n+" is a prime number.");
else
    System.out.println(+n+" is not a prime number.");    
}
}

