class weakarm
{
public static void main(int n)
{
int m=n,p,s=0,k=0;
while(m>0)
{
p=m%10;
s=s*10+p;
m=m/10;
}
for(int i=1;s>0;i++)
{
p=s%10;
k=k+(int)Math.pow(p,i);
s=s/10;
}
if(n==k)
{
System.out.println(n+" is a weakarm number");
}
else
{
System.out.println(n+" is not a weakarm number");
}}}