import java.io.*;
class countfact_dowl
{
public static void main(String args[])throws IOException
{
 int n,i,c=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to count its factors");
n=Integer.parseInt(br.readLine());
i=1;
do
{
if(n%i==0)
{
c++;
}
i++;
}
while(i<=n);
System.out.println("The no of factors are "+c);
}
}

