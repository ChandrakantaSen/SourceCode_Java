package All;

class check3
{
    public static void main(int a)
    {
        if (a>0 && a%2==0)
        {
            int b=a+2;
            int c=b+2;
            int d=c+2;
            System.out.println(+b+" , "+c+" , "+d);
        }
        else if (a<0 && a%2!=0)
        {
            int e=a-2;
            int f=e-2;
            int g=f-2;
            System.out.println(+e+" , "+f+" , "+g);
        }
    }
}