import java.io.*;
public class salary
{
    String name,address,subject,specs;
    int phone,ms;
    double it;
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        salary t=new salary();
        t.accept();
        t.compute();
        t.display();
    }
    void accept()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the name");
        name=in.readLine();
        System.out.println("Enter the address");
        address=in.readLine();
        System.out.println("Enter the phone number");
        phone=Integer.parseInt(in.readLine());
        System.out.println("Enter the specialization");
        specs=in.readLine();
        System.out.println("Enter the monthly salary");
        ms=Integer.parseInt(in.readLine());
    }
    void compute()
    {
        if(ms>175000)
        {
            it=ms*(5.0/100.0);
        }
        else
        it=0;
    }
    void display()
    {
        System.out.println("Name-"+name);
        System.out.println("Address-"+address);
        System.out.println("Phone no.-"+phone);
        System.out.println("Specialization-"+specs);
        System.out.println("Monthly Salary="+ms);
        System.out.println("Income Tax="+it);
    }
}
        
    
    
    