package All;

class pascal_triangle
{
    public static void main(int n)
    {
        int i, c;
        pascal_triangle obj = new pascal_triangle();
        for ( i = 0 ; i < n ; i++ )
        {
            for ( c = 0 ; c <= ( n - i - 2 ) ; c++ )
                System.out.print(" ");
            for( c = 0 ; c <= i ; c++ )
                System.out.print(obj.factorial(i)/(obj.factorial(c)*obj.factorial(i-c))+" ");
            System.out.println();
        }
    }

    int factorial(int n)
    {
        int c;    
        int result = 1;

        for( c = 1 ; c <= n ; c++ )
            result = result*c;
        return ( result );
    }
}