/*A file SCHOOL.TXT contains the names and addresses of all its students.
Write a program in java to print the address of all students whose name is "TRIXY".
Assume that file may contain the names more than once.Your program should display
"Name Not Found"if the name doesn't exist in file.   */

import java.io.*;
public class Ques4
{
    public static void main(String args[])throws IOException
    {
    FileReader f=new FileReader("School.txt");
    BufferedReader buf=new BufferedReader(f);
    String h;
    boolean var=false;
    while((h=buf.readLine())!=null)
    {
    String mr1=buf.readLine();
    if(h.compareTo("TRIXY")==0)
    {
    var=true;
    System.out.println("Name:"+h);
    System.out.println("Address:"+mr1);
}
    }
    if(var==false)
    System.out.print("Name Not Found");
    f.close();
}
}