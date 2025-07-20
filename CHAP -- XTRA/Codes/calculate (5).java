import java.util.*;
class calculate
{
    public static void main(String args[])
    {
        char c;
        int 
        a,l,b,s,r1;
        double area=0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("press c for area of circle");
        System.out.println("press s for area of square");
        System.out.println("press r for area of rectangle");
c=in.next().charAt(0);
        switch (c)
        {
            case 'c':
            System.out.println("enter the radius");
            r1=in.nextInt();
            double p=3.14;
            area=p*r1*r1;
            System.out.println("area of the circle is"+area);
            break;
            case 's':
            System.out.println("enter the side");
            a=in.nextInt();
            area=a*a;
            System.out.println("area of square is"+area);
            break;
            case 'r':
            System.out.println("enter length and breadth");
            l=in.nextInt();
            b=in.nextInt();
            area=l*b;
            System.out.println("area of the rectangle"+area);
            break;
            default:
            System.out.println("wrong input");
        }
    }
}
            
            
            
            
            
            
        
        
  
       
        
        
    

