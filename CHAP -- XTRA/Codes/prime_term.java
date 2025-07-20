class prime_term
{
public static void main(int n)
{
int m=0;
System.out.println("All the prime nos. upto "+n+" are: ");
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
m++;
}
}
if(m==1 || m==2)
{
System.out.println(i);
}
m=0;
}}}