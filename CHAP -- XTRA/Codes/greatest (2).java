class greatest
{
    public static void main(int n)
    {
        int r,max=0;
        while(n>0)
        {
            r=(n%10);
            n=(n/10);
            if(r>max)
            max=r;
        }
    System.out.println("greatest number is"+max);
}
}
