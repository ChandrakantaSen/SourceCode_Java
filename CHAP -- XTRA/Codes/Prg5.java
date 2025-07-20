import java.io.*;
class Prg5
{
public static void main(String args[])throws IOException
{
int i,n,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range : - ");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" ");
    }
for(j=1;j<=((2*n)-(i*2))+1;j++)
{
if(j%2==1)
{
System.out.print("a");
    }
    else
    {
System.out.print(" ");
    }
    }
    System.out.println();
}
    }
}
