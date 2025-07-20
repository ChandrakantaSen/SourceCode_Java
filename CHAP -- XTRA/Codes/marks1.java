import java.io.*;
class marks1 extends student1   
{
    int regnum, marks;
    String subject;
    marks1()
    {
        regnum=0;
        marks=0;
    }
    public void inpdetails2()throws IOException
    {
        System.out.println("Enter the register number of the student : ");
        regnum=Integer.parseInt(br.readLine());
        System.out.println("Enter the subject : ");
        subject=br.readLine();
        System.out.println("Enter the marks obtained in "+subject+" : ");
        marks=Integer.parseInt(br.readLine());
    }
    public void show2()throws IOException
    {
        super.inpdetails1();
        inpdetails2();
        super.show1();
        System.out.println("The register number of the student is : "+regnum);
        System.out.println("The subject is : "+subject);
        System.out.println("The marks obtained in "+subject+" is : "+marks);
    }
}