import java.io.*;
class reema2
{
    static int a,b,c;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    reema2(int x,int y)//PARAMETERIZED CONSTRUCTOR
    {
        a=x;
        b=y;
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
        System.out.println("The addition value of "+a+" and "+b+" is :  "+c);               
    }
    public static void main(String args[])throws IOException
    { 
        reema2 ob=new reema2(5,47);
        ob.display();
        ob.add();
        ob.show();
    }
}