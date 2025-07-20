class real_armstrong
{
public static void main(int a)
{
int b=a,p,s=0,n=0,h;
while(b>0)
{
p=b%10;
b=b/10;
n++;
}
b=a;
while(b>0)
{
p=b%10;
b=b/10;
h=(int)Math.pow(p,n);
s=s+h;
}
if(a==s)
{
System.out.println(a+" is an armstrong no.");
}
else
{
System.out.println(a+" is not an armstrong no.");
}}}