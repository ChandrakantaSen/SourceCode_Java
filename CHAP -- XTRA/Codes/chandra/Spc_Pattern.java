class Spc_Pattern
{
    public static void main()
    {
        int i,j,p=11,t;
        
        for(i=1;i<=5;i++)
        {
            t=p;
            for(j=1;j<=i;j++)
            {
                System.out.print(t+" ");
                t=t+10;
            }
            p++;
            System.out.println();
        }
    }
}
