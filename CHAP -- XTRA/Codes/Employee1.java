import java.io.*;
class Employee1
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int empNo;
    static String empName,empDesig;
    Employee1()//DEFAULT CONSTRUCTOR
    {
        empNo=0;
    }
    Employee1(int eNo,String eName,String eDesig)//PARAMETERISED CONSTRUCTOR
    {
        empNo=eNo;
        empName=eName;
        empDesig=eDesig;
    }
    public void display()
    {
        System.out.println("the employee number : "+empNo);
        System.out.println("the name of the employee : "+empName);
        System.out.println("the designation of the employee : "+empDesig);
    }
}
    
