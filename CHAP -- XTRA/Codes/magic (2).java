class magic
{
public static void main(int n)
{
int m=n,p,s=0;
while(n>=10)
{
while(n>0)
{
p=n%10;
n=n/10;
s=s+p;
}
n=s;
s=0;
}
if(n==1)
{
System.out.println(m+" is a magic no.");
}
else
{
System.out.println(m+" is not a magic no.");
}
}}