import java.io.*;
class countf   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
System.out.println("Enter the number to count its factor");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
    }
}
System.out.println("The number of factors of the number"+n+"is"+c);
    }
}