import java.io.*;
class pattern15
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,j,i;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=i;j>=1;j--)
{
System.out.print(i+" ");
    }
    System.out.println();
}
    }
}