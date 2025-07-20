import java.io.*;
class student1
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name,sex;
    int age;
    student1()
    {
      age=0;  
    }
    public void inpdetails1()throws IOException
    {
        System.out.println("Enter the name of the student :  ");
        name=br.readLine();
        System.out.println("Enter the sex of the student (Male/Female) :  ");
        sex=br.readLine();
        System.out.println("Enter the age of the student :  ");
        age=Integer.parseInt(br.readLine());
    }
    public void show1()throws IOException
    {
        System.out.println("The name of the student is : "+name);
        System.out.println("The student is a : "+sex);
        System.out.println("The age of the student is : "+age);
    }
}