import java.io.*;
class fact
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String input;
int n, fact=1;
System.out.println(" enter any number:");
input=br.readLine();
n=Integer.parseInt(input);
if(n>=0)
{
while(n>1)
{
fact=fact*n;
n=n-1;
    }
    System.out.println(" factorial is"+'\t'+fact);
}
else
{
System.out.println(" number must be greater than zero");
    }
}
    }
    
