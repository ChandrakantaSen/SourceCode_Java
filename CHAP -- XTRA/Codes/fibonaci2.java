class fibonaci2
{
    public static void main(String args[])
    {
        int a=0,b=1,c,i,k=0;
        for(i=1;i<=7;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            k=k+c;
        }
        System.out.println("sum is"+k);
    }
}
