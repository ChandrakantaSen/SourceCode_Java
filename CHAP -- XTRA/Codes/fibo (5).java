package All;

class fibo
{
    int a,b,c;
    fibo(int x, int y)
    {
        a=x;
        b=y;
    }
    void calc()
    {
        System.out.println(" "+a);
        System.out.println(" "+b);
        for(int i=0;i<=10;i++)
        {
            if(i<=1)
            {
                c=i;
            }
            else
            {
                c=a+b;
                a=b;
                b=c;
                System.out.println(" "+c);
            }
        }
   }
}