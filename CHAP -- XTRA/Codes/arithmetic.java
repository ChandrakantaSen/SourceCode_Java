import java.util.*;
class arithmetic
{
    int a,b;
    void add()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the numbers");
        a=in.nextInt();
        b=in.nextInt();
        int c=a+b;
        System.out.println(c);
    }
    void multiply()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the numbers");
        a=in.nextInt();
        b=in.nextInt();
        int d=a*b;
        System.out.println(d);
    }
    void subtract()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the numbers");
        a=in.nextInt();
        b=in.nextInt();
        int h=a-b;
        System.out.println(h);
    }
    public static void main(String args[])
    {
      arithmetic ob=new arithmetic();
        Scanner in=new Scanner(System.in); 
    System.out.println("press 1 for addition");
    System.out.println("press 2 for subtraction");
    System.out.println("press 3 for multiplication");
    int e=in.nextInt();
    switch(e)
    {
        case 1:
        ob.add();
        break;
        case 2:
        ob.subtract();
        break;
        case 3:
        ob.multiply();
        break;
        default:
        System.out.println("wrong input");
    }
}
}
      
        
        
