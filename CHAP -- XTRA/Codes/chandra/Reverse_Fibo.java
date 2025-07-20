class Reverse_Fibo
{
    static void main(int n)
    {
        int i,a=0,b=1,c=0;
        for(i=1;i<=n;i++)
        {
            c=a+b;
            if(i==n)
            {
                System.out.print(c+" ");
                i=0;c=0;a=1;b=0;n--;
            }
            b=a;
            a=c;
        }
    }
}