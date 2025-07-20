import java.io.*;
class automorphic1
{
public static void main(String args[])throws IOException
{
int n,c=0,m,i;
double a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to check whether it is automorphic or not");
n=Integer.parseInt(br.readLine());
System.out.println("The automorphic numbers upto"+n+"are as follows");
for(i=1;i<=n;i++)
{
c=0;
m=i;
while(m>0)
{
c++;
m=m/10;
    }
    m=i*i;
    a=m%Math.pow(10,c);
    
    if(a==i)
    {
        System.out.println(i);
    }
}
       
    }
}