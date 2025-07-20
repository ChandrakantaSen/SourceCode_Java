import java.io.*;
public class Laptop
{

    String name;
    double price,dis,amt;
    Laptop(String n,double p)
    {
        name=n;
        price=p;
       
    }
    
    void compute()
    {
        if(price<=25000)
        {
            dis=5.0;
            amt=price-(dis*price)/100;
        }
        else if((price>25000)&&(price<=50000))
        {
            dis=7.5;
            amt=price-(dis*price)/100;
        }
        else if((price>50000)&&(price<=100000))
        {
            dis=10.0;
            amt=price-(dis*price)/100;
        }
        else
        {
            dis=15.0;
            amt=price-(dis*price)/100;
        }
    }
    void display()
    {
        System.out.println("Name-"+name);
        System.out.println("Discount="+dis);
        System.out.println("Amount="+amt);
    }
    public static void main(String args[])throws IOException
    {
        String n;
        double p;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the name");
        n=in.readLine();
        System.out.println("Enter the price");
        p=Double.parseDouble(in.readLine());
        Laptop t=new Laptop(n,p);

        t.compute();
        t.display();
    }
}
    
    

           
            
        
     
    
        
        