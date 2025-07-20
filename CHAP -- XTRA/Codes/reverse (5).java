class reverse
{
public static void main(int n)
{
int p,s=0,m=n;
while(n>0)
{
p=n%10;
s=(s*10)+p;
n=n/10;
}
System.out.println("The reverse of "+m+" is "+s);
}}