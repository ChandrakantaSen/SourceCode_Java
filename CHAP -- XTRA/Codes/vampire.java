class vampire
{
public static void main(int n)
{
int m=n,a=0,f=1,p,k,l;
while(m>0)
{
m=m/10;
a++;
}
m=n;
if(a%2==0)
{
for(int i=1;i<=a;i++)
{
f=f*i;
}
for(int i=1;i<=f;i++)
{
