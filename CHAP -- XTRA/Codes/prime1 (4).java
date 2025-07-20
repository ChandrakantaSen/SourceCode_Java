package All;

class prime1
{
    public static void main(int b)
    {
        int c=0;
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
    

}
          