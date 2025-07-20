import java.util.*;
import java.lang.*;
class Employee implements Employee1
{
    static String s,l,k,j;
    static int b;
    static double t=0.0;
    static Scanner sc=new Scanner(System.in);
    public void emp()
    {
        System.out.println("Enter the name of the employee");
        s=sc.nextLine();
        System.out.println("Enter the age of the employee");
        l=sc.nextLine();
        System.out.println("Enter the sex of the employee");
        k=sc.nextLine();
        System.out.println("Enter the address of the employee");
        j=sc.nextLine();
        System.out.println("Enter the basic salary of the employee");
        b=sc.nextInt();
    }
    public void calculate()
    {
        if((b*12)<=250000)
        {   
            t=0;
        }
        else
        {
            t=((((b*12)-250000)*0.05)+10000);
        }
    }
       public void display()
    {
        System.out.println("The name of the employee is "+s);
        System.out.println("The age of the employee is "+l);
        System.out.println("The sex of the employee is "+k);
        System.out.println("The address of the employee is "+j);
        System.out.println("The basic salary of the employee is "+b);
        System.out.println("The tax is "+t);
    }
}
        