package All;

import java.util.*;
class Temperature
{
    double max,min,f1,f2;
    Temperature(double mx,double mn)
    {
        max=mx;
        min=mn;
    }
    void compute()
    {
        f1=((9*max)/5)+32;
        f2=((9*min)/5)+32;
    }
    void display()
    {
        System.out.println("Maximum temperature in Fahrenheit : "+f1+" F");
        System.out.println("Minimum temperature in Fahrenheit : "+f2+" F");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maximum and minimum temperatures respectively in centigrade : ");
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        Temperature ob=new Temperature(c1,c2);
        ob.compute();
        ob.display();
    }
}