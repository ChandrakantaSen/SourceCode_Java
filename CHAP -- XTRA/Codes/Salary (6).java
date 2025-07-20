import java.io.*;
class Salary
{
    String name;
String address;
long phone ;
String subject ;
String specialisation;
int monthlysalary;
double incometax ;
void main () throws IOException 
{ Salary s = new Salary();
    s.accept();
    s.display();
    s.calculate();}
    void accept () throws IOException 
    {BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter name");
       name = br.readLine();
       System.out.println("Enter address ");
       address = br.readLine();
       System.out.println("Enter phone number");
       phone = Long.parseLong(br.readLine());
       System.out.println("Enter subject ");
       subject=br.readLine();
       System.out.println("Enter speacialisation ");
       specialisation = br.readLine();
       System.out.println("Enter monthly salary");
       monthlysalary = Integer.parseInt(br.readLine());
    }
    void display()
    {System.out.println("Name:" +name);
        System.out.println("Address : "+address);
        System.out.println("Phone Number : "+phone);
        System.out.println("Subject :"+subject);
        System.out.println("Speacialisation :"+specialisation);
        System.out.println("Monthly salary :"+monthlysalary);
    }
    void calculate()
    {int a=monthlysalary*12;
        if (a>300000)
        {incometax=0.05*(a-300000);
         System.out.println("Annual income tax :"+incometax);
        }
        else
        System.out.println("Annual salary is less than 3 lakh .");
    }
}
