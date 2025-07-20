package All;

class fibo_class
{
    public static void main(String args[])
    {
        fibo obj = new fibo(0,1);
        fibo obj1=obj;
        
        obj1.calc();
    }
}