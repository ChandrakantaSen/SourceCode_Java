import java.io.*;
class reema
{
    static int a,b,c,d;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    reema()//DEFAULT CONSTRUCTOR
    {
        a=0;
        b=0;
    }
    public static void input()throws IOException
    {
        System.out.println("Enter the first number : -   ");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number : -   ");
        b=Integer.parseInt(br.readLine());
    }
    public static void display()
    {
        System.out.println("The two  numbers are "+a+" and "+b);       
    }
    public static void add()
    {
        c=a+b;
    }
    public static void sub()
    {
        d=a-b;
    }
    public static void show()
    {    
        System.out.println("The addition value of "+a+" and "+b+" is :  "+c);
        System.out.println("The subtraction value of "+a+" and "+b+" is :  "+d);               
    }
    public static void main(String args[])throws IOException
    { 
        reema ob=new reema();
        ob.input();
        ob.display();
        ob.add();
        ob.sub();
        ob.show();
    }
}