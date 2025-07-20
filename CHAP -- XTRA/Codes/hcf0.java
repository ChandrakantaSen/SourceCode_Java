import java.io.*;
class hcf0   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,hcf=1,i,lcm;
System.out.println("Enter the first number");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the second number");
m=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{
if((n%i==0)&&(m%i==0))
{
hcf=i;
    }
    i++;
}
lcm=(m*n)/hcf;
System.out.println("The highest common factor of"+n+"and"+m+"is:-"+hcf);
System.out.println("The lowest common multiple of"+n+"and"+m+"is:-"+lcm);
    }
}