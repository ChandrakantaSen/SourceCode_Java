package Puspendu;

import java.util.*;
class Employee_Cons
{
static Scanner sc=new Scanner(System.in);
static String name;double mi,ts,hra,ta,ma;
Employee_Cons()
{
System.out.println("Please enter the name of employee :");
name=sc.nextLine();
System.out.println("Please enter the monthly salary of employee :");
mi=sc.nextDouble();
}
public void Salary()
{
hra=0.35*mi;
ta=0.25*mi;
ma=0.41*mi;
ts=mi+hra+ta+ma;
System.out.println("Total Salary : " +ts);
}
public static void main()
{
Employee_Cons obj=new Employee_Cons();
obj.Salary();
System.out.println("Employee name: "+name);
}
}
