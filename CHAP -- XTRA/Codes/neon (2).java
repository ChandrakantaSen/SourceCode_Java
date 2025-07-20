class neon
{
public static void main(int n)
{
int p=n*n;
int h,s=0;
while(p>0)
{
h=p%10;
s=s+h;
p=p/10;
}
if(s==n)
{
System.out.println(n+" is a neon number");
}
else
{
System.out.println(n+" is not a neon number");
}
}}
