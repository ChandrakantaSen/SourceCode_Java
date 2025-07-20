import java.io.*;
class hcf   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,hcf=1,i,lcm;
System.out.println("Enter the first number");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the second number");
m=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if((n%i==0)&&(m%i==0))
{
hcf=i;
    }
}
lcm=(m*n)/hcf;
System.out.println("The highest common factor of"+n+"and"+m+"is:-"+hcf);
System.out.println("The lowest common multiple of"+n+"and"+m+"is:-"+lcm);
    }
}