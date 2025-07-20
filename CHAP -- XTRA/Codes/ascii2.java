import java.io.*;
class ascii2
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range: ");
n=Integer.parseInt(br.readLine());
for(i=65;i<=n+64;i++)
{
for(j=65;j<=i;j++)
{
System.out.print((char)(i));
    }
    System.out.println();
}
    }
}	