import java.io.*;
class perfect
{
public static void main(String args[])throws IOException
{
int i,n,s=0;
BufferedReader lkkb=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.");
n=Integer.parseInt(lkkb.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
    }
}
if(s==n)
{
System.out.println(n+" is a perfect no.");
    }
    else
    {
        System.out.println(n+" is not a perfect no.");
    }
}
    }