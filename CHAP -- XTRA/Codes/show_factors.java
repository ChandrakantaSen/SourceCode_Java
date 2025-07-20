class show_factors
{
public static void main(int n)
{
System.out.println("The factors of "+n+" are: ");
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println(i);
}
}}}