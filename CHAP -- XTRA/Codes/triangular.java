package All;

class triangular
{    
    public static void main(String args[]) 
    { 
        for (int i = 1 ; i < 100 ; i++)
        {
            int n = i*(i+1)/2;
            System.out.println( "n="+i+" triangle number="+n );
        }
    }
}