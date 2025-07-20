package All;

import java.io.*;
public class employee
{
    int pan;
    String name;
    double taxincome,tax;
    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the pan number");
        pan=Integer.parseInt(in.readLine());
        System.out.println("Enter the name");
        name=in.readLine();
        System.out.println("Enter Taxable income");
        taxincome=Double.parseDouble(in.readLine());
    };
    void cal()
    {
        if(taxincome<=100000)
        {
            tax=0.0;
        }
        else if((taxincome>100000)&&(taxincome<=150000))
        {
            tax=(taxincome-100000)*(10.0/100.0);
        }
        else if((taxincome>150000)&&(taxincome<=250000))
        {
            tax=5000+(taxincome-150000)*(20.0/100.0);
        }
        else
        {
            tax=25000+(taxincome-250000)*(30.0/100.0);
        }
    }
    void display()
    {
        System.out.println("Pan number     Name     Tax-Income     Tax");
        System.out.println("  "+pan+"    "+name+"     "+taxincome+"     "+tax);
    }
    public static void main(String args[])throws IOException
    {
        employee t=new employee();
        t.input();
        t.cal();
        t.display();
    }
}


            
    
    