class primepalindrome
{
 public static void main(String args[])
 {
 for(int h=1;h<=1000;h++)
{
int m=h,p=0,c=0;
while(m>0)
{
p=m%10;
m=m/10;
c=c*10+p;
}
if(c==h)
{
int t;
for(t=2;t<h;t++)
{
if(h%t==0)
break;
}
if(h==t)
System.out.println("prime pallindrome="+h);
}
}
}
}
