import java.io.*;
class real_armstrong0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m;
double d,s=0,c=0;
System.out.println("Enter the number to check whether it is real armstrong or not");
n=Integer.parseInt(br.readLine());
for(m=n;m>0;m=m/10)
{
c++;
    }
 for(m=n;m>0;m=m/10)
 {
     d=m%10;
     s=s+Math.pow(d,c);
    }
    if((int)(s)==n)
    {
    System.out.println(n+"is a real armstrong number");
}
    else
    {
         System.out.println(n+"is not a real armstrong number");
}
 
}
}