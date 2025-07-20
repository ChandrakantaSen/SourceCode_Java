class ramanujan
{
public static void main(int n)
{
int m=n,p,s=0;
while(n>0)
{
p=n%10;
n=n/10;
s=s*10+p;
}
int h=m*s;
s=0;
while(h>0)
{
p=h%10;
h=h/10;
s=s+p;
}
if(s==m)
{
System.out.println(m+" is a ramanujan number");
}
else
{
System.out.println(m+" is not a ramanujan number");
}
}}