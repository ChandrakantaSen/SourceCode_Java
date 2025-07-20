import java.io.*;
class factors
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader mk=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.");
n=Integer.parseInt(mk.readLine());
System.out.println("The factors of the no. are as follows");
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println(i);
    }
}
    }
}