class number52
{
    public static void main(String args[])
    {
        int i;long k=0,p=1;
        for(i=1;i<=6;i++)
        {
            k=i*p+k;
            System.out.print(k+" ");
            p=p*10;
        }
    }
}
