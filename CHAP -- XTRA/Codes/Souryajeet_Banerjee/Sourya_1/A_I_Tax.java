import java.io.*;
public class A_I_Tax
{
    void Tax(double income)
    {
        double tax,amount=0;
        if(income<=50000)
        {
            tax=0;
            System.out.println("Salary:- "+income);
            System.out.println("No Tax");
            System.out.println("Total Amount to be paid to the government:- "+tax);
        }
        else if(income<=100000)
        {
            tax=10;
            amount=tax/100*(income-50000);
            System.out.println("Salary:- "+income);
            System.out.println("Tax:- "+tax+"%");
            System.out.println("Total Amount to be paid to the government:- "+amount);
        }
        else if(income<=150000)
        {
            tax=20;
            amount=tax/100*(income-100000)+5000;
            System.out.println("Salary:- "+income);
            System.out.println("Tax:- "+tax+"%"+"+5000");
            System.out.println("Total Amount to be paid to the government:- "+amount);
        }
        else if(income>150000)
        {
            tax=30;
            amount=tax/100*(income-150000)+15000;
            System.out.println("Salary:- "+income);
            System.out.println("Tax:- "+tax+"%"+"+15000");
            System.out.println("Total Amount to be paid to the government:- "+amount);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double g;
        System.out.print("Enter your annual saleary{income}:- ");
        g=Double.parseDouble(br.readLine());
        A_I_Tax ob=new A_I_Tax();
        ob.Tax(g);
    }
}