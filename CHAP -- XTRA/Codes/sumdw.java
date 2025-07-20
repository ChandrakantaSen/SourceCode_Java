import java.io.*;
class sumdw   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,s=0;
i=1;
System.out.println("Enter the number to find the sum its factor");
n=Integer.parseInt(br.readLine());
do
{
if(n%i==0)
{
s=s+i;
    }
    i++;
}
while(i<=n);
System.out.println("The sum of the factors of the number"+n+"is"+s);
    }
}