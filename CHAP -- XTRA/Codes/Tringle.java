class Tringle
{
    public static void main(String args[])
    {
        int z=1,n=4;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=i-1;k>=-(i-1);k--)
            {
                System.out.print(i-Math.abs(k));
            }
            z=z+2;
            System.out.println();
        }
    }
}