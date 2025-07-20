class Patterndc
{
void abc()
{
int s,n;
for(int i=1;i<=4;i++)
{
if(i==1)
{
System.out.print("1");
}
else
{
for(int k=1;k<=2;k++)
{
if(k==1)
System.out.print(i+" ");
else
{
s=i;n=1;
for(int l=3;l>=1&&n<=i-1;l--)
{
s=s+l;
System.out.print(s+" ");
n++;
}
}
}
}
System.out.println();
}
}
}