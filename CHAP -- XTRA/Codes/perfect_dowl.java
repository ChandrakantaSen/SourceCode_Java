import java.io.*;
class perfect_dowl
{
public static void main(String args[])throws IOException
{
 int n,i,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to check whether it is perfect or not");
n=Integer.parseInt(br.readLine());
i=1;
do
{
if(n%i==0)
{
s=s+i;
}
i++;
}
while(i<n);
if(s==n)
{
System.out.println(n+"is a perfect number");
}
else
{
System.out.println(n+"is not a perfect number");
}
}
}

