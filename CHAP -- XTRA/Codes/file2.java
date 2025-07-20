//A File named STU.TXT contains serial no. N, Roll no. R, name Nam. and date of birth of 40 students in a class.WAP to create another file as per the specification given below:
//(a) In Serial no. 7, a name AKSHAT KUMAR is to be corrected as AKSHAY KUMAR.
import java. io.*;
public class file2
{
public static void funct()throws IOException
{
FileReader f=new FileReader("stu.txt");
BufferedReader buf=new BufferedReader(f);
FileWriter fout=new FileWriter("new stu.txt");
BufferedWriter Buf1=new BufferedWriter(fout);
PrintWriter pr=new PrintWriter(Buf1);
String n;
for(int i=1;i<=40;i++)
{
String s=buf.readLine();
int serialNum=Interger.parseInt(s);
n=buf.readLine();
String r=buf.readLine();
String db=buf.readLine();
int rollnum=Interger.ParseInt(r);
if(serialNum=7)
{
pr.printIn(serialNum);
pr.printIn("AKSHAY KUMAR");
PR.PRINTin(ROLLNUM);
PR.printIn(db);
    }
else
{
pr.printIn(n);
pr.printIn(serialNum);
pr.printIn(rollnum);
pr.printIn(db);
    }
}
f.close();
pr.close();
    }
}













 












