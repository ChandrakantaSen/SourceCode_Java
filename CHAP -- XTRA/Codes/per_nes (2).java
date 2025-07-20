import java.io.*;
class per_nes
{
static int i,n,j,s; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  range : - ");
n=Integer.parseInt(br.readLine());
    }
public static void pershow()
{
System.out.println("Perfect numbers are as follows :- ");
for(i=1;i<=n;i++)
{
s=0;
for(j=1;j<i;j++)
{
if(i%j==0)
{
s=s+j;
    }
}
    if(s==i)
    {
        System.out.println(i);
    }
}
    }
public static void main()throws IOException
    {
        per_nes ob=new per_nes();
        ob.input();
        ob.pershow();
    }
}
    