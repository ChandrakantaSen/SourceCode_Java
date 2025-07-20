import java.io.*;
class sumw   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,s=0;
i=1;
System.out.println("Enter the number to find the sum of its factor");
n=Integer.parseInt(br.readLine());
while(i<=n)
{
if(n%i==0)
{
s=s+i;
    }
    i++;
}
System.out.println("The sum of the factors of the number"+n+"is"+s);
    }
}