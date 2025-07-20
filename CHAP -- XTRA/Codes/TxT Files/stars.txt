import java.io.*;
class stars
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n;
System.out.println("Enter no of stars:");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=2;j>=1;j--)

System.out.println(" ");

for(k=i;k>0;k--)
{
System.out.print("\t *");
    }

  }
}
    }
