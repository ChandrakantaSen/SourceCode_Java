package All;

import java.util.*;
class salary
{
    String name,add,sub;
    long ph;
    double sal,tax=0;
    
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name:");
        name = in.nextLine();
        System.out.println("enter the address:");
        add = in.next();
        System.out.println("enter the salary:");
        sal = in.nextDouble();
    }
    
    void calculate()
    {
        if(12*sal>175000)
        {
            tax = (sal*12)*5/100;
        }
        else
        {
            tax =0;
        }
    }
    
    void display()
    {
        System.out.println(name);
        System.out.println(add);
        System.out.println(sal);
        System.out.println(tax);
       // System.out.println();
       // System.out.println();
    }
    
    public static void main(String args[])
    {
        salary obj = new salary();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
