package All;

class nested
{
    public static void main (int a,int b,int c)
    {
    if(a>b)
    {
        if(a>c)
        {
            System.out.print("A is max");
        }
        else 
        {
            System.out.print("C is max");
        }
    }
        else
        {
            if(b>c)
            {
                System.out.print("B is max");
            }
            else
            {
                System.out.print("C is max");
            }
        }
    }
}