package All;

public class class_overload
{
    double area(double r)
    {
        double ar1 = 22/7*r*r;
        return (ar1);
    }
    
    int area(int s)
    {
        int ar2 = s*s;
        return (ar2);
    }
    
    double area(double a, double b)
    {
        double ar3 = a*b;
        return (ar3);
    }
    
    void main()
    {
        int n;
        double m,p;
        
        class_overload obj = new class_overload();
        m= obj.area(5.3);
        n= obj.area(8);
        p= obj.area(6.2,3.6);
        
        System.out.println("Area of Circle: "+m);
        System.out.println("Area of Square: "+n);
        System.out.println("Area of Rectangle: "+p);
    }
}