import java.io.*;
class reema1
{
    static int a,b,c;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    reema1()//DEFAULT CONSTRUCTOR
    {
        a=5;
        b=4;
    }
    public static void display()
    {
        System.out.println("The two  numbers are "+a+" and "+b);       
    }
    public static void add()
    {
        c=a+b;
    }
    public static void show()
    {    
        System.out.println("The addition value of "+a+" and "+b+" is : - "+c);               
    }
    public static void main(String args[])throws IOException
    { 
        reema1 ob=new reema1();
        ob.display();
        ob.add();
        ob.show();
    }
}