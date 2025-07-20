import java.io.*;
class Emp
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int Number;
    String Name,Addr,Department;
    Emp(int Num,String Nme,String Adr,String Depa)//PARAMETERISED CONSTRUCTOR
    {
        Number=Num;
        Name=Nme;
        Addr=Adr;
        Department=Depa;
    }
    public void display()
    {
        System.out.println("the employee number : "+Number);
        System.out.println("the name of the employee : "+Name);
        System.out.println("the address of the employee : "+Addr);
        System.out.println("the department of the employee : "+Department);
    }
}
    