import java.io.*;
class digit2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int n,m,d;
System.out.println("Enter the no.:-");
n=Integer.parseInt(br.readLine());
m=n;
System.out.println("The extracted digit from "+n+" are as follows:-");
do
{
d=m%10;
System.out.println(d);
m=m/10;
    }
while(m>0);
    }
}
