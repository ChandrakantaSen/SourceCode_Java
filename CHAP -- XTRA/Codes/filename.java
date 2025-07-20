//Write a program to read the above created file EMP.TXT and print all records in the following format:
                    //MEHTA & SONS LTD.
           //Record no.  :
           //Code        :
           //Name        :
           //Designation :
           //Basic Salary:

 import java.io.*;
    public class filename
    {
        public static void main(String args[])throws IOException
        {
        FileReader f=new FileReader("EMP.txt");
        BufferedReader b=new BufferedReader(f);
        String h;
        System.out.println("MEHTA & SONS LTD.");
        while((h=b.readLine())!=null)
        {
        System.out.println(h);
    }
    f.close();
}
    }
            