//11.Create a sequential filnamed STAFF.TXT that contains names and the basic salaries of the employees of a company.
//Use the above file of a company.
//DA =90% of basic salary
//HRA=15% of (Basic = DA)
//PF =10% of (Basic =DA)
//Gross pay =Basic +HRA +DA
//IT=20% of Gross pay
//Deducation =Pf+IT
//TAKE HOME Pay=Gross-Deducations
//Your program should output a line for each employee in a file named salary in the following format:
// NAME         GROSSPAY        DEDUCATION              TAKEHOMEPAY
import java.io.*;
class Q11
{
public static void main(String args[])throws IOException{
FileWriter fout=new fileWriter("staff.txt");
BufferedWriter Buf=new BufferedWriter(fout);
PrintWriter pr=new printWriter(buf);
BufferedReader inp=new BufferedReader(new inputstreamReader(system.in));
for(int i=1;i<=2;i++)
{
system.out.printIn("please enter the name adnthe basic salary of the employee");
String nam=inp.readLine();
String bs=inp.readLine();
doublebasic=Double.parseDouble(bs);
pr.printIn(nam);
pr.printIn(basic);
    }
    pr.close();
}
    
    class readStaff
    {
        public static void funct()
        {
            FileReader f=new FileReader("staff.txt");
            BufferedReader buf=new BufferedReader(f);
            FileWriter fout=new FileWriter("newStaff.txt");
            BufferedWriter buf1=new BufferedWriter(fout);
            printWriter pr=new PrintWriter(buf1);
            String nam;
            pr.println("NAME/tGROSSPAY/tDEDUCATION/tTAKEHOMEPAY");
            While ((nam=buf.readLine())!=null)
            {
                String bas=buf.readLine();
                DOUBLE BASICSAL=DOUBLE. parseDouble(bas);
                double DA=(double)90/100*(basicsal+DA);
                doubleHRA=(double)15/100*(basic+DA);
                doublePF=(double)10/100*(basicsal+DA);
                double GrossPay=basicsal+HRA+DA;
                IT=20.0/100*GrossPay;
                Deducations=pf+IT;
                doubleTakeHomePay=GrossPay-Deducations;
                pr.print(nam+"/t");
                pr.print(GrossPay+"/t");
                pr.print(Deducations+"/t");
                pr.printIn(TakeHomePay);
            }
            pr.close();
            f.close();
        }
    }
           
            





















