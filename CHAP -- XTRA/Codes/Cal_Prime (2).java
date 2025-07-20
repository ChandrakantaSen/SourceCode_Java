package All;

class Cal_Prime
{
    public boolean prime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if (c==2)
        return true;
        else
        return false;
    }
    public static void main(int n)
    {
        Cal_Prime obj=new Cal_Prime();
        
        for(int i=1;i<=n;i++)
        {
            if (obj.prime(i)==true)
            System.out.println(i);
        }
    }
}
        
       