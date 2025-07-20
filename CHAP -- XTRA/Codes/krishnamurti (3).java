class krishnamurti
{
public static void main(int n)
{
int p,s=0,f=1,a=n;
while(a>0)
{
p=a%10;
for(int i=1;i<=p;i++)
{
f=f*i;
}
s=s+f;
a=a/10;
f=1;
}
if(s==n)
{
System.out.println(n+" is a krishanmurti no.");
}
else
{
System.out.println(n+" is not a krishanmurti no.");
}
}}