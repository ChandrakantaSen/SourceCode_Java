import java.io.*;
class rev_nes
{
static int i,n,m,d,s; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the range  : - ");
n=Integer.parseInt(br.readLine());
    } 
public static void reverseshow()
{
System.out.println("The reverse number are as follows  ");
for(i=10;i<=n;i++)
{
m=i;
s=0;
while(m>0)
{
d=m%10;
s=(s*10)+d;
m=m/10;
    }
System.out.println(s); 
        }
    }
    public static void main()throws IOException
    {
        rev_nes ob=new rev_nes();
        ob.input();
        ob.reverseshow();
    }
}
    