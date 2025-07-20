import java.io.*;
class pattern11
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,j,i;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)(48+i)+" ");
    }
    System.out.println();
}
    }
}