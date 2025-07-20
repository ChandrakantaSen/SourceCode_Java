import java.io.*;
class auto_nes
{
static int i,m,k,n,c,d,c1,n1; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  range : - ");
k=Integer.parseInt(br.readLine());
    }
public static void autoshow()
{
System.out.println("Automorphic numbers are as follows :- ");
for(i=1;i<=k;i++)
{
d=0;
c=0;
c1=0;
n=i*i;
m=n;
while(m>0)
{
c++;
m=m/10;
    }
m=n;    
d=0;
    if(c==2)
    {
while(m>0)
{
d=m%10;
c1++;
if(c1==1)
{
break;
    }
    }
    }
else if(c==3)
    {
while(m>0)
{
d=m%100;
c1++;
if(c1==1)
{
break;
    }
    }
    } 
if(d==i)
{
System.out.println(i);
    }
}
}
public static void main()throws IOException
    {
        auto_nes reema=new auto_nes();
        reema.input();
        reema.autoshow();
    }
}
    