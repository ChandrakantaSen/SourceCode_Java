import java.io.*;
class magic 
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to check wheather the number is magic number or not : -");
n=Integer.parseInt(br.readLine());
m=n;
while(m>9)
{
s=0;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if(s>9)
    {
        m=s;
    }
}
    if(s==1)
    {
        System.out.println(n+"is a magic no.");
    }
   else
    {
        System.out.println(n+"is a not magic no.");
    }
}
    }