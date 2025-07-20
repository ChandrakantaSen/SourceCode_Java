class Zo
{
    void main()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=6-i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}