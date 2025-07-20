class prime_term1
{
public static void main(int m,int n)
{
int a=0;
System.out.println("All the prime nos. between "+m+" & "+n+" are: ");
for(int i=m+1;i<n;i++)
{
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
a++;
}
}
if(a<=2)
{
System.out.println(i);
}
a=0;
}}}