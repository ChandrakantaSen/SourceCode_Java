import java.io.*;
class composite_wl
{
public static void main(String args[])throws IOException
{
 int n,i,c=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to check whether it is composite or not");
n=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{
if(n%i==0)
{
c++;
}
i++;
}
if(c>2)
{
System.out.println(n+"is a composite number");
}
else
{
System.out.println(n+"is not a composite number");
}
}
}

