import java.io.*;
class employee2
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int pin;
    static double basic;
    static String name,city,address;
    employee2(String name1,String city1,String addr,int p,double b)
    {
        name=name1;
        city=city1;
        address=addr;
        pin=p;
        basic=b;
    }
   static double da()
    {
        return (1.5*basic);
    }
    static double hr()
    {
        return (0.3*basic);
    }
   static void print()
   {
       double gr;
       gr=basic+hr()+da();//instance function
       System.out.println("Name : -"+name);
       System.out.println("City : -"+city);
       System.out.println("Address : -"+address);
       System.out.println("Pincode : -"+pin);
       System.out.println("Basic Salary : -"+basic);       
       System.out.println("Gross Salary : -"+gr);       
    }
    public static void main(String args[])throws IOException
    {
        String n,c,a;
        int p;
        double b;
       System.out.println("Name : -");
       n=br.readLine();
       System.out.println("City : -");
       c=br.readLine();
       System.out.println("Address : -");
       a=br.readLine();
       System.out.println("Pincode : -");
       p=Integer.parseInt(br.readLine());
       System.out.println("Basic Salary : -");
       b=Double.parseDouble(br.readLine());
       employee2 ob=new employee2(n,c,a,p,b);
       ob.print();
    }
}