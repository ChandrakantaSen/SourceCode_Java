import java.io.*;
class Salary extends Employee
{
    float da,hra,salary,pf,netsalary;
    int basic;
    public void calculate()throws IOException
    {
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