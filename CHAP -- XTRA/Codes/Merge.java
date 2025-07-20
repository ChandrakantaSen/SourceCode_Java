//Create two files STU!.TXT and STU2.TXT. Each contains names of students Merge the two files to create one file STU.TXT.
import java .io.*;
class Merge
{
public static void main (String args[]) throws IOException
{
FileWriter fout=new FileWriter("stu.txt");
BufferedWriter buf=new BufferedWriter(fout);
PrintWriter pr=new PrintWriter(buf);
BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
for(int i=1;i<=5;i++)
{
System.out.println("Enter name");
String nam=inp.readLine();
pr.println(nam);
    }
  pr.close();
  FileWriter fout2=new FileWriter("stu.txt");
  BufferedWriter buf2=new BufferedWriter(fout2);
  PrintWriter prt=new PrintWriter(buf2);
  for(int i=1;i<=3;i++)
  {
      System.out.println("Enter name");
      String nam=inp.readLine();
      prt.println(nam);
    }
    prt.close();
    /*Merging the two files stu1.txt and stu2.txt*/
    FileReader fin=new FileReader("stu1.txt");
    BufferedReader buf4=new BufferedReader(fin);
    FileReader fil=new FileReader("stu1.txt");
    BufferedReader buf5=new BufferedReader(fil);
    FileWriter fout3=new FileWriter("MergedStu.txt");
    BufferedWriter buf3=new BufferedWriter(fout3);
    PrintWriter pr33=new PrintWriter(buf3);
    String h;
    while((h=buf4.readLine())!=null)
    {
        pr33.println(h);
    }
    String n;
    while((n=buf5.readLine())!=null)
    {
        pr33.println(n);
    }
    pr33.close();
}
    }
    
  
  