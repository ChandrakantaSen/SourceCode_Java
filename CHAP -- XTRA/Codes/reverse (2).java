import java.io.*;
class reverse
{
public static void main()throws IOException
{
int i,n,m,d,s=0; 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the  number : - ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=(s*10)+d;
m=m/10;
    }
 System.out.println("Reverse of the number is "+s);
}
    }