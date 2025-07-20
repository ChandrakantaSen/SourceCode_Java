class twinprime
{
public static void main()
{
int i,a,b,u=0,j,f1,f2;
for(i=1;i<=100;i++)
{
a=i;
b=i+2;
f1=0;
f2=0;
if(i!=u)
{
for(j=2;j<a;j++)
{
if(a%j==0)
f1=1;
    }
    for(j=2;j<b;j++)
    {
        if(b%j==0)
        f2=1;
    }
    if(f1==0&&f2==0)
    {
  System.out.println(a+"&"+b);      
}
    }
}
    }
}
