import java.util.Scanner;
class Sqrt 
{
    public void getTheSqrt( int n )
    {
        double a = (double) n;
        double x = 1;

        for( int i = 0; i < n; i++)
        {
            x = 0.5 *(x+a / x );
        }
        System.out.println("sqrt of " + a + " is " + x);
    }

    public static void main(String[] args) 
    {
        Scanner Sa = new Scanner(System.in);
        Sqrt S = new Sqrt();

        System.out.println("Enter n: ");
        int n = Sa.nextInt();

        S.getTheSqrt( n );

    } 
}