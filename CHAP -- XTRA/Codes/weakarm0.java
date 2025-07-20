class weakarm0
{
public static void main(int n)
{
int m=n,p,c=0,k=0;
while(m>0)
{
c++;
m=m/10;
}
m=n;
while(m>0)
{
p=m%10;
k=k+(int)Math.pow(p,c);
m=m/10;
c--;
}
if(n==k)
{
System.out.println(n+" is a weakarm number");
}
else
{
System.out.println(n+" is not a weakarm number");
}}}