import java.io.*;
class magic_nes
{
static int i,n,m,d,s; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  range : - ");
n=Integer.parseInt(br.readLine());
    }
public static void magicshow()
{
System.out.println("Magic numbers are as follows :- ");
for(i=10;i<=n;i++)
{
m=i;
s=0;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
if((s==10)||(s==1))
{
System.out.println(i);  
        }  
        }
    }
public static void main()throws IOException
    {
        magic_nes ob=new magic_nes();
        ob.input();
        ob.magicshow();
    }
}
    