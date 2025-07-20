class calculate
{
    double area(double l, double b)
    {
        return(l*b);
    }
    double area(double s)
    {
        return(s*s);
    }
    double area(int r)
    {
        return(3.14*r*r);
    }
    public static void main(String args[]) {
        double a,b,c;
        calculate obj = new calculate();
        
        a=obj.area(10,20);
        b=obj.area(5);
        c=obj.area(2);
        System.out.println("Area of rectangle: "+a);
        System.out.println("Area of square: "+b);
        System.out.println("Area of circle: "+c);
    }
    
}
