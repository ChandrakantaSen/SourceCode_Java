import java.io.*;
class nloop1
{
public static void main(String args[])throws IOException
{
int i,n,fact=1;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no.: -");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
fact=fact*i;
{
System.out.println("The output is "+fact);
    }
}
    }