import java.io.*;
class evendowhile
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
i=1;
do
{
if(i%2==0)
{
s=s+i;
    }
    i++;
}
while(i<=n);
System.out.println("The sum of the even no. is"+s);
    }
}
  