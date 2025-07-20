import java.io.*;
class fact_whileloop
{
public static void main(String args[])throws IOException
{
 int n,i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to print its factorial");
n=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{
if(n%i==0)
{
System.out.println(i);
}
i++;
}


}
}
