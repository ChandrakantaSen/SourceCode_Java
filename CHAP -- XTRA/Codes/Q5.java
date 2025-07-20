class Q5
{
    public static void main()
    {
        int k=0,i=0,j,c;
        while(k<=50)
        {
            i++;
            c =0 ;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(i);
                k++;
            }
        }
    }
}
