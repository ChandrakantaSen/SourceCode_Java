import java.util.*;

class OverloadDemo
{
    double x;
    double y;

    void area_calc(int x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }

    void area_calc(int x, int y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        OverloadDemo obj = new OverloadDemo();
        obj.area_calc(10);
        obj.area_calc(20,30);
    }
}