import java.io.*;
class automorphic_no
{
public static void main(String args[])throws IOException
{
BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
int c=0,p=0,q=0,d=0,r=0,k=0;;
int n;
System.out.println("Enter the number : - ");
n=Integer.parseInt(in.readLine());
p=n*n;
int m=n;
while(m>0)
{
q=m%10;
m=m/10;
d++;
    }
while(d>0)
    {
        r=1*10;
    }
        k=p%r;
           
   
   if(k==n)
    System.out.println(" it is an automorphic no");
    else
    System.out.println(" it is not an automorphic no");
}
    }
