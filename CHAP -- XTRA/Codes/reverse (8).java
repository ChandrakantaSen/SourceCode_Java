class reverse
{
    public static void main(int n)
    {
        int r;
        while(n>0)
        {
            r=(n%10);
            n=(n/10);
            System.out.print(r);
        }
    }
}

