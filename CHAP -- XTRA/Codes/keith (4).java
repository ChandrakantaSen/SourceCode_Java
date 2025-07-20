class keith
{
public static void main(int n)
{
int m=n,p=0,s=0,h=0,t=0;
while(n>0)
{
p=n%10;
n=n/10;
s=s+p;
t=t*10+p;
}
int k=t;
while(t>0)
{
h=s*2;
p=t%10;
t=t/10;
h=h-p;
}
t=k;
int r=h;
System.out.println(h);
while(h<m)
{
h=h*2;
h=h-s;
s=s*2;
if(t>0)
{
p=t%10;
t=t/10;
s=s-p;
}
else
{
s=s-r;
r=r*2;
r=r-p;
p=r;
}
}
if(h==m)
{
System.out.println("Keith");
}}}
