import java.io.*;
class armstrong1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,d,s=0;
System.out.println("Enter the number to find whether it is armstrong or not ");
n=Integer.parseInt(br.readLine());
for(m=n;m>0;m=m/10)
{
d=m%10;
s=s+(d*d*d);
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