import java.io.*;
class Prg8
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range: ");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=n;j<=i;j--)
{
System.out.print("a");
    }
    System.out.println();
}
    }
}	
