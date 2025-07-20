import java.io.*;
class reema3
{
    static int a,b,c;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    reema3(int x,int y)//PARAMETERIZED CONSTRUCTOR
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
        int p,q,x,y,k,l;
        System.out.println("Enter the first number : -   ");
        p=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number : -   ");
        q=Integer.parseInt(br.readLine());        
        reema3 ob=new reema3(p,q);
        ob.display();
        ob.add();
        ob.show();
        System.out.println("Enter the first number : -   ");
        x=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number : -   ");
        y=Integer.parseInt(br.readLine());        
        reema3 ob1=new reema3(x,y);
        ob1.display();
        ob1.add();
        ob1.show();
        System.out.println("Enter the first number : -   ");
        k=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number : -   ");
        l=Integer.parseInt(br.readLine());        
        reema3 ob2=new reema3(k,l);
        ob2.display();
        ob2.add();
        ob2.show();
    }
}