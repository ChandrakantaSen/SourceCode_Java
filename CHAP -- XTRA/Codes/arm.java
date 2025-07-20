class arm
{
    public static void main(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int c=0;
            int copy=i;
            int b=0;
            while(copy!=0)
            {
                c=c+1;
                copy=copy/10;
            }
            copy=i;
            while(copy!=0)
            {
                int d=copy%10;
                int s=(int)Math.pow(d,3);
                b=b+s;
                copy=copy/10;
            }
            if(b==i)
            {
                System.out.println(b);
            }
        }
    }
}