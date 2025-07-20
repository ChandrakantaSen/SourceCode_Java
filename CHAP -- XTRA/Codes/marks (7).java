import java.io.*;
class marks extends student
{
     int regnum, marks;
    String subject;
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
        /*System.out.println("The name of the student is : "+super.name);
        System.out.println("The student is a : "+super.sex);
        System.out.println("The age of the student is : "+super.age);*/
        System.out.println("The register number of the student is : "+regnum);
        System.out.println("The subject is : "+subject);
        System.out.println("The marks obtained in "+subject+" is : "+marks);
    }
}
