import java.io.*;
class swhile
{
public static void main(String args[])throws IOException
{
int i=1,s=0,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
System.out.println("Enter the range: - ");
while(i<=n)
{
s=s+i;
i++;
    }
    System.out.println("The sum of the series : - "+s);
}
    }