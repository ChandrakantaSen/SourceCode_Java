class pattern6
{
    public static void main(String args[])
    {
        int i,j,s;
        for(i=1;i<=4;i++)
        {
            for(s=1;s<=4-i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
       System.out.println();
    }
        
    }
}
