import java.io.*;
class armstrong   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to find whether it is armstrong or not ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s+(d*d*d);
m=m/10;
    }
 if(s==n)
 {
     System.out.println(n+"is an armstrong number");
    }
    else
    {
        System.out.println(n+"is not an armstrong number");
    }
}
}