import java.io.*;
class prime_pelindrome1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,d,m,s=0,count=0,j;
System.out.println("Enter a number:- ");
n=Integer.parseInt(br.readLine());
for(j=1;j<=n;j++)
{
count=0;
s=0;
d=0;
for(i=1;i<=j;i++)
{
if(j%i==0)
{
count++;
    }
}
if(count==2)
{
m=j;
while(m>0)
{
d=m%10;
s=s*10+d;                      
m=m/10;
    }
if(j==s)
{
System.out.println(j);
    }
    
}
}
    }
}
