import java.io.*;
class arm_func_VARIABLELIST
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x;
System.out.println("Enter the no.");
x=Integer.parseInt(br.readLine());
if(Armstrong(x)==1)
{
System.out.println(x+"is an armstrong no.");
}
else
{
System.out.println(x+"is not an armstrong no.");
}
    }
public static int Armstrong(int n)
{
int m,d,s=0;
m=n;
while(m>0)
{
d=m%10;
s=s+(d*d*d);
m=m/10;
    }
    if(s==n)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
    }