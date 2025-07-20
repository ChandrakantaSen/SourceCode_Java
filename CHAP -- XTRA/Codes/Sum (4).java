class Sum
{
    public static void main (int n)
    {
        int d = 0;
        int a = (n%10);
        int b = (n/10)%10;
        int c = n/100;
         d = a+b+c;
        System.out.println("the result is"+d);
    }
}
