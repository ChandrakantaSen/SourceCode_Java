class karpekar
{
public static void main(int a)
{
int h=a*a;
int p,k,r,n=0,b=a;
while(b>0)
{
b=b/10;
n++;
}
r=(int)Math.pow(10,n);
p=h%r;
k=h/r;
if(p+k==a)
{
System.out.println(a+" is a karpekar number");
}
else
{
System.out.println(a+" is not a karpekar number");
}
}}