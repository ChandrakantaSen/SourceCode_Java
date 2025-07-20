import java.io.*;
class krish_nes
{
static int i,j,n,m,d,s,fact; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the range : - ");
n=Integer.parseInt(br.readLine());
    } 
public static void krishshow()
{
System.out.println("The krishnamurthy numbers are as follows :- ");
for(i=100;i<=n;i++)
{
m=i;
s=0;
while(m>0)
{
d=m%10;
fact=1;
for(j=1;j<=d;j++)
{
fact=fact*j;
    }
s=s+fact;
m=m/10;
if(s==i)
{
System.out.println(i);
    }
    }
}
    }
    public static void main()throws IOException
    {
        krish_nes ob=new krish_nes();
        ob.input();
        ob.krishshow();
        
    }
}
    