import java.io.*;
class vamp_no0_range0
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n1=0,n2=0,n,nd=0,i,j,n3=0,n4=0,flag=0,k,l,d,d1,m,c=0,c1=0,p;
System.out.println("Enter number to check for vampire no");
n=Integer.parseInt(br.readLine());
for(i=1;i<n/2;i++)
{
for(j=n/2-1;j>1;j--)
{
if(((n%i==0)&&(n%j==0))&&(i*j==n))
{
n3=0;
c=0;
c1=0;
n1=i;
n2=j;
m=n1;
while(m>0)
{
c++;
m=m/10;
}
k=n2;
while(k>0)
{
c1++;
k=k/10;
}
if(c==c1)
{
l=n;
while(l>0)
{
p=l%10;
l=l/10;
m=n1;
n3=0;
n4=0;
while(m>0)
{
d=m%10;
if(d==p)
{
n3=d;
c--;
}
m=m/10;
}
k=n2;
while(k>0)
{
d=k%10;
if(d==p)
{
n4=d;
c1--;
}
k=k/10;
}
}
if((c==0)&&(c1==0)&&(n3!=n4))
{
System.out.println(n+" is a vampire no"+c1+"  "+c+"  "+n1+"  "+n2);
flag=1;
break;
}
c=0;
c1=0;
}
}
}
}
if(flag==1)
{
System.out.println(n+" is a vampire no"+n1+"  "+n2);
}
else
{
System.out.println(n+" is not a vampire no"+n1+"  "+n2);
}
}
    }