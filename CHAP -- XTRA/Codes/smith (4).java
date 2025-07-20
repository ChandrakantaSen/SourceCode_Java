class smith
{
public static void main(int n)
{
int m=n,p,s=0,h=0,r=0,k;
while(m>0)
{
p=m%10;
s=s+p;
m=m/10;
}
m=n;
while(m>1)
{
for(int i=2;i<=m;i++)
{
if(m%i==0)
{
h=i;
System.out.println(h);
break;
}}
m=m/h;
if(h>=10)
{
k=h;
h=0;
while(k>0)
{
p=k%10;
k=k/10;
h=h+p;
}}

r=r+h;
}
if(r==s)
{
System.out.println(n+" is a Smith no.");
}
else
{
System.out.println(n+" is not a Smith no.");
}
}}