class q6
{
    public static void main(int n)
    {
        int i,j,k;
        for(i=n;i>=1;i--)
        {
            for(j=i;j<n;j++)
                System.out.print(" ");
            for(k=i;k>=1;k--)
                System.out.print("*");
            System.out.println();
        }
    }
}
