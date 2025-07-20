import java.io.*;
class factf   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i;
System.out.println("Enter the number to find out its factor");
n=Integer.parseInt(br.readLine());
System.out.println("The factors of the number"+n+"are as follows:");
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println(i);
    }
}
    }
}