class Fibonacci
{
    public static void main(String args[])
    {
        int f0 = 0,f1=1;
        int f2;
        for(int i=0;i<10;i++)
        {
            f2 = f0+f1;
            f0 = f1;
            f1 = f2;
            System.out.println(f2);
           
        }
    }
}
