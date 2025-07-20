import java.io.*;
class fact_dowhile
{
public static void main(String args[])throws IOException
{
 int n,i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to find out its factorial");
n=Integer.parseInt(br.readLine());
i=1;
do
{
if(n%i==0)
{
System.out.println(i);
}
i++;
}
while(i<=n);
}
}

