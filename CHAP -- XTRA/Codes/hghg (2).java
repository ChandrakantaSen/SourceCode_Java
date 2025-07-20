//(b) A new name is to be added as follows:
//Serial no:22
//Roll No. :2122
//name :MONTEK
//DATE OF BIRTH :12-02-85
import java.io.*;
public class Q10b
{
public static void funct()throws IOException
{
FileReader f=new FileReader("stu.txt");
BufferedReader buf=new BufferedReader(f);
FileWriter Fout=new FileWriter("newstu1.txt");
BufferedWriter buf22=new BufferedWriter(fout);
PrintWriter Pr=new PrintWriter(buf22);
String h;
while(h=buf.readLine())!=null)
{
int sn=Integer.parseInt(h);
String nm=buf.readLine();
String rn=buf.readLine();
int roll=Integer.parseInt(rn);
String date=buf.readLine();
pr.printIn(sn);
pr.printIn(nm);
pr.printIn(roll);
pr.printIn(date);
    }
 pr.printIn(22);
 pr.printIn("Montek");
 pr.printIn(2122);
 pr.printIn("12-02-85");
 pr.close();
 f.close();
}
    }

 







