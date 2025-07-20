import java.io.*;
class Salary1 extends Employee1
{
    float basic;
    Salary1(int eNo,String eName,String eDesig,float bas)
    {
        super(eNo,eName,eDesig);
        basic=bas;
    }
    public void calculate()throws IOException
    {
        float da,hra,salary,pf,netsalary;
        super.display();
        System.out.println("Enter the basic salary ");
        basic=Integer.parseInt(br.readLine());
        da=basic*.10f;
        hra=basic*0.15f;
        salary=basic+da+hra;
        pf=salary*.08f;
        netsalary=salary-pf;
        System.out.println("The net salary of the employee is : "+netsalary);
    }
}