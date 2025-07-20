public class class_overload2
{
    void area(double r)
    {
        double ar1 = 22/7*r*r;
        System.out.println("Area is:"+ar1);
    }
    
    void area(int s)
    {
        int ar2 = s*s;
        System.out.println("Area is:"+ar2);
    }
    
    void area(double a, double b)
    {
        double ar3 = a*b;
        System.out.println("Area is:"+ar3);
    }
}