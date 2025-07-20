import java.io.*;
class countdw   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,c=0;
i=1;
System.out.println("Enter the number to count its factor");
n=Integer.parseInt(br.readLine());
do
{
if(n%i==0)
{
c++;
    }
    i++;
}
while(i<=n);
System.out.println("The number of factors of the number"+n+"is"+c);
    }
}