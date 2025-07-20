import java.io.*;
class Employee
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int empNo;
    String empName,empDesig;
    public void display()throws IOException
    {
        System.out.println("Enter the employee number : ");
        empNo=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of the employee : ");
        empName=br.readLine();
        System.out.println("Enter the designation of the employee : ");
        empDesig=br.readLine();
    }
}