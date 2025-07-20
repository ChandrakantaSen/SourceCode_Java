class descen
{
public static void main(int a)
{
int b=a,p,n=0,h=0,k=a,r=0,m=0;
while(b>0)
{
b=b/10;
n++;
}
b=a;
for(int i=1;i<=n;i++)
{
while(b>0)
{
p=b%10;
b=b/10;
if(h<p)
{
h=p;
}}
b=k;
while(b>0)
{
p=b%10;
b=b/10;
if(p==h)
{
m=(m*10)+p;
}
else
{
r=(r*10)+p;
}
}
k=r;
b=k;
h=0;
r=0;
}
System.out.println(m);
}}