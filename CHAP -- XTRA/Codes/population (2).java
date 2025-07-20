
class population
{
float p,r;
population(int a,int b)
{
p=a;
r=b;
    }
    void print()
    {
        for(int i=1;i<=7;i++)
        {
           float q=p*(1+(r/100));
            System.out.println("The population for the year 200"+i+" is "+q);
             p=q;
        }
    }
}


 