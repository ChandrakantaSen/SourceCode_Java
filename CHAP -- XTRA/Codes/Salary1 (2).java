class Salary1
{
    public static void main(int c)
    {
        int d,e;
        if(c<=100000)
        {
            e = 0 ;
        }
        else if((c>100000)&&(c<=150000))
        {
            d = c - 100000;
            e = (10*d)/100;
        }
        else if((c>150000)&&(c<=250000))
        {
            d = (c-150000);
            e = ((5000+(20*d)/100));
        }
        else
        {
            d = c-250000;
            e = (((30*d)/100)+25000);
        }
        System.out.println("cost price "+c);
        System.out.println("income tax Mr.Singh pays "+e);
    }
}
        
        
        
        
        
        
        
        
      