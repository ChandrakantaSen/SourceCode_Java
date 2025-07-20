import java.io.*;
class oddwhile
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
i = 1 ;
while(i<=n)
{
if(i%2!=0)
{
s=s+i;
    }
    i++;
}
System.out.println("The sum of the odd no. is"+s);
    }
}
