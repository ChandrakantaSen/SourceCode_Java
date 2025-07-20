class sum_of_the_factors
{
public static void main(int n)
{
int s=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
s=s+i;
    }
}
System.out.println("The sum of the factors of "+n+" is:-"+s);
    }
}   