class count_no_of_factors
{
public static void main(int n)
{
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
    }
}
System.out.println("The number of factors of the number "+n+" is:-"+c);
    }
}