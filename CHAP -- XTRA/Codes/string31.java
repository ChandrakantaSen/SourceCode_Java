import java.io.*;
class string31
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char k='A';
int i,j,n;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(k);
k++;
    }
    System.out.println();
}
    }
}