import java.io.*;
class pattern8
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range: ");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
System.out.print(" "+i);
    }
    System.out.println();
}
    }
}	
