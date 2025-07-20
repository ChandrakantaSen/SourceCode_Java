import java.util.*;
class Example
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in) ;
        Car cars[] = new Car[3];
        String temp;

        for(int i=0;i<cars.length;i++)
        {
            System.out.println("enter the car model please:");
            temp=sc.next();
            cars[i]=new Car();
            cars[i].setModel(temp);
        }

        for(int i=0;i<cars.length;i++)
        {
            System.out.println("Model: "+cars[i].getModel());
        }
    }
}