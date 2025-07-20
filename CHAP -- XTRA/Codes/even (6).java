class even
{
    public static void main(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                continue;
            }
            else
            {
              System.out.println(i);
              sum = sum+i;
            }
        }
        System.out.println("the sum is "+sum);
    }
}
           