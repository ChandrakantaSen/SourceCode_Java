import java.io.*;
class Employee
{
int empNo;
String empName;
String empDesig;
public Employee()
{
empNo=0;
}
public Employee(int eno,String ename,String edesig)
{
empNo=eno;
empName=ename;
empDesig=edesig;
}
public void display()
{
System.out.println("Employee No :"+empNo);
System.out.println("Employee Name :"+empName);
System.out.println("Employee Designation :"+empDesig);
}
}
class Salary extends Employee
{
double basic;
public Salary(int eno,String enm,String edg,float bas)
{
super(eno,enm,edg);
basic=bas;
}
public void calculate()
{
double salary, netsalary;
double DA,HRA,PF;
DA = basic * 0.10;
HRA = basic * 0.15;
PF = basic * 0.08;
salary = basic + DA + HRA;
netsalary = salary - PF;
super.display();
System.out.println("Net Salary :"+ netsalary);
}
}
public class Payslip
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
System.out.println("\t \t \t Payslip of employees");
System.out.println("\t \t \t_______________________");
System.out.print("Employee No");
int n=Integer.parseInt(br.readLine());
System.out.print("Employee Name");
String s=br.readLine();
System.out.print("Employee Designation");
String m=br.readLine();
System.out.print("Employee Basic Salary");
int bs=Integer.parseInt(br.readLine());
Salary s1 = new Salary(n,s,m,bs);
s1.calculate();
}
} 