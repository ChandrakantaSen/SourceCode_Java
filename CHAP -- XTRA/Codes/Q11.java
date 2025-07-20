/*Create a sequential filnamed STAFF.TXT that contains names and the basic salaries of the employees of a company.
Use the above file of a company.
DA =90% of basic salary
HRA=15% of (Basic = DA)
PF =10% of (Basic =DA)
Gross pay =Basic +HRA +DA
IT=20% of Gross pay
Deducation =Pf+IT
TAKE HOME Pay=Gross-Deducations
Your program should output a line for each employee in a file named salary in the following format:
 NAME         GROSSPAY        DEDUCATION              TAKEHOMEPAY                  */
import java.io.*;
class Q11
{
public static void main(String args[])throws IOException{
FileWriter fout=new FileWriter("staff.txt");
BufferedWriter buf=new BufferedWriter(fout);
PrintWriter pr=new PrintWriter(buf);
BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
for(int i=1;i<=2;i++)
{
System.out.println("please enter the name adnthe basic salary of the employee");
String nam=inp.readLine();
String bs=inp.readLine();
double basic=Double.parseDouble(bs);
pr.println(nam);
pr.println(basic);
    }
    pr.close();
}
    
    class readStaff
    {
        public  void funct()throws IOException
        {
            
            FileReader f1=new FileReader("staff.txt");
            BufferedReader buf=new BufferedReader(f1);
            FileWriter fout=new FileWriter("newStaff.txt");
            BufferedWriter buf1=new BufferedWriter(fout);
            PrintWriter pr=new PrintWriter(buf1);
            String nam;
            double DA=0.0,HRA=0.0,PF=0.0,GrossPay=0.0;
            pr.println("NAME \t GROSSPAY \t DEDUCATION\tTAKEHOMEPAY");
            while ((nam=buf.readLine())!=null)
            {
                String bas=buf.readLine();
                double basicsal=Double.parseDouble(bas);
                 DA=(double)90/100*(basicsal+DA);
                 HRA=(double)15/100*(basicsal+DA);
                PF=(double)10/100*(basicsal+DA);
                GrossPay=basicsal+HRA+DA;
               double IT=0.20*GrossPay;
                double Deducations=PF+IT;
                double TakeHomePay=GrossPay-Deducations;
                pr.print(nam+"/t");
                pr.print(GrossPay+"/t");
                pr.print(Deducations+"/t");
                pr.println(TakeHomePay);
            }
            pr.close();
            f1.close();
        }
    }
}