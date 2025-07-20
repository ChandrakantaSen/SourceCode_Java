class count_factors
{
public static void main(int n)
{
int k=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
k++;
}
}
System.out.println("The no. of factors of "+n+" = "+k);
}}