import java.io.*;
class pali_nes
{
static int i,n,m,d,s; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  range : - ");
n=Integer.parseInt(br.readLine());
    } 
public static void palishow()
{
System.out.println("Palindrome numbers are as follows :- ");
for(i=11;i<=n;i++)
{
m=i;
s=0;

while(m>0)
{
d=m%10;
s=(s*10)+d;
m=m/10;
    }
if(s==i)
{
System.out.println(i);
    }
}
}
public static void main()throws IOException
{
        pali_nes ob=new pali_nes();
        ob.input();
        ob.palishow();
           }
}
    