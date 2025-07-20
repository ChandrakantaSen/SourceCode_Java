import java.io.*;
public class P_S_R_C
{
    void square(double s)
    {
        s=s*4;
        System.out.print("Peremeter of Square"+s);
    }
    void rectangle(double a,double b)
    {
        double s=(a+b)*2;
        System.out.print("Peremeter  of rectangle= "+s);
    }
    void circle(double r)
    {
        double c=2*3.14*r;
        System.out.print("Peremeter of circle= "+c);
    }
}