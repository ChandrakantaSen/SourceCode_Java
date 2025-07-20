import java.io.*;
class countfact_fl
{
public static void main(String args[])throws IOException
{
 int n,i,c=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to count its factors");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
c++;
}
}
System.out.println("The no of factors are "+c);
}
}

