class duck
{
public static void main(int n)
{
int m=n,p,h=0;
while(n>0)
{
p=n%10;
n=n/10;
if(p==0)
{
h=1;
break;
}
}
if(h==1)
{
System.out.println(m+" is a duck number");
}
else
{
System.out.println(m+" is not a duck number");
}
}}