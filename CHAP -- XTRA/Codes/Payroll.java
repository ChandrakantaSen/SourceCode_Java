import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
class Payroll
{
static int pA[]={1234,2345,3456,4567,5678};
static String A[]={"A.Mishra","P.Dhar","S.Swami","N.Dey","D.Banerjee"};
static int pB[]={1111,2222,3333,4444,5555};
static String B[]={"A.Majumdar","P.Ghosh","S.Das","B.De","S.Mukherjee"};
static int pC[]={6666,7777,8888,9999,1010};
static String C[]={"K.Haldar","G.Choudhury","G.Das","S.Majumdar","A.Ghosh"};
static int pD[]={1212,1313,1414,1515,1616};
static String D[]={"N.Haldar","L.Das","P.Mishra","S.Dutta","F.Choudhury"};
static Payroll ob=new Payroll();
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static Date dt = new Date();
static int bsA=100000,bsB=75000,bsC=45000,bsD=25000,bassal=0;
static double da=0,ma=0,hra=0,ta=0,bon=0,ded=0,inctax=0;
static int pos,code;char g;
static double incentives,grosssal,netsal,it;
String name;
public void masthead()throws IOException
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("         -----------------------------------------------------------------------------");
System.out.println("                     WELCOME TO THE PAYROLL SYSTEM OF THE XYZ COMPANY                   ");
System.out.println("         -----------------------------------------------------------------------------");
System.out.println("                              "+dt);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
ob.login();
}
public void masthead1()throws IOException
{
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("         -----------------------------------------------------------------------------");
System.out.println("                     WELCOME TO THE PAYROLL SYSTEM OF THE XYZ COMPANY                   ");
System.out.println("         -----------------------------------------------------------------------------");
System.out.println("                              "+dt);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
public void login()throws IOException
{
System.out.println();
System.out.println();
System.out.print("Please enter your username : ");
String un=br.readLine();
System.out.print("Please enter your password : ");
String p=br.readLine();
System.out.println("Validating details............");
String pass="admin";
System.out.println();
for(int i=0;i<999999999;i++)
{/*Empty loop to cause delay*/}
if(un.equals(pass) && p.equals(pass))
{
System.out.println("    !!Password Validated!!");
ob.EmployeeCheck();
}
else
{
System.out.println("!!!!Incorrect password or username!!!!");
System.out.println("         Please Reenter");
ob.delay();
System.out.println("\f");
ob.masthead();
}
}
public void delay()
{
for(long i=0;i<999999999;i++)
{
}
}
public void EmployeeCheck()throws IOException
{
System.out.println();
System.out.println();
System.out.print("Please enter the group of the employee (Eg.A,B,C,D) : ");
g=br.readLine().charAt(0);
int i;pos=1000;
if(g=='A'||g=='B'||g=='C'||g=='D')
{
System.out.print("Please enter the employee code : ");
code=Integer.parseInt(br.readLine());
if(g=='A')
{
for(i=0;i<5;i++)
{
if(pA[i]==code){
pos=i;
break;
}
}
}
else if(g=='B')
{
for(i=0;i<5;i++)
{
if(pB[i]==code){
pos=i;
break;
}
}
}
else if(g=='C')
{
for(i=0;i<5;i++)
{
if(pC[i]==code){
pos=i;
break;
}
}
}
else if(g=='D')
{
for(i=0;i<5;i++)
{
if(pD[i]==code){
pos=i;
break;
}
}
}
}
else
{
System.out.println("!!!!Invalid Input!!!!");
System.out.println("!!Please Reenter!!");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.EmployeeCheck();
}
System.out.println();
System.out.println("Processing............");
ob.delay();
System.out.println();
if(pos!=1000)
{
if(g=='A')
{
System.out.println("Employee name : "+A[pos]);
System.out.println("Employee code : "+pA[pos]);
bassal=bsA;name=A[pos];
System.out.println("Basic Salary (in Rs.)  : "+bassal);
}
else if(g=='B')
{
System.out.println("Employee name : "+B[pos]);
System.out.println("Employee code : "+pB[pos]);
bassal=bsB;name=B[pos];
System.out.println("Basic Salary (in Rs.)  : "+bassal);
}
else if(g=='C')
{
System.out.println("Employee name : "+C[pos]);
System.out.println("Employee code : "+pC[pos]);
bassal=bsC;name=C[pos];
System.out.println("Basic Salary (in Rs.)  : "+bassal);
}
else if(g=='D')
{
System.out.println("Employee name : "+D[pos]);
System.out.println("Employee code : "+pD[pos]);
bassal=bsD;name=D[pos];
System.out.println("Basic Salary (in Rs.)  : "+bassal);
}
ob.menu();
}
if(pos==1000)
{
System.out.println();
System.out.println("!!!!Employee not listed in database!!!!");
System.out.println("         !!Please Reenter!!");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.EmployeeCheck();
}

}
public void menu()throws IOException
{
System.out.println();
System.out.println("Please enter your choice from the menu below :");
System.out.println("=> (1) Incentives");
System.out.println("=> (2) Deductions");
System.out.println("=> (3) Bonus");
System.out.println("=> (4) Display Employee Payslip");
System.out.println("=> (5) Start With Another Employee");
System.out.println("=> (6) Exit");
System.out.println();
System.out.print("Your choice : ");
int ch=Integer.parseInt(br.readLine());
System.out.println("Processing..............");
ob.delay();
System.out.println("\f");
ob.masthead1();
System.out.println();
System.out.println();
switch(ch)
{
case 1:ob.incentives();
break;
case 2:ob.deductions();
break;
case 3:ob.bonus();
break;
case 4:ob.payslip();
break;
case 5:ob.start();
break;
case 6:ob.exit();
break;
default: System.out.println("!!!!Wrong Input!!!!");
ob.masthead();
System.out.println();
ob.menu();
}
}
public void incentives()throws IOException
{
System.out.println();
System.out.print("Please enter the Medical Allowance (in %) : ");
int MA=Integer.parseInt(br.readLine());
System.out.print("Please enter the House Rent Allowance (in %) : ");
int HRA=Integer.parseInt(br.readLine());
System.out.print("Please enter the Dearness Allowance (in %) : ");
int DA=Integer.parseInt(br.readLine());
System.out.print("Please enter the Travel Allowance (in %) : ");
int TA=Integer.parseInt(br.readLine());
ma=(MA*0.01)*bassal;
hra=(HRA*0.01)*bassal;
da=(DA*0.01)*bassal;
ta=(TA*0.01)*bassal;
System.out.println("Processing............");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.menu();
System.out.println();
}
public void deductions()throws IOException
{
System.out.print("Please enter the Income Tax Deduction (in %) : ");
it=Double.parseDouble(br.readLine());
System.out.print("Please enter any other Deductions (in Rs.) : ");
ded=Integer.parseInt(br.readLine());
System.out.println("Processing............");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.menu();
System.out.println();
}
public void bonus()throws IOException
{
System.out.print("Please enter the Bonus Amount (in Rs.) : ");
bon=Integer.parseInt(br.readLine());
System.out.println("Processing............");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.menu();
System.out.println();
}
public void calculate()
{
incentives=ma+da+hra+ta;
grosssal=bassal+incentives+bon;
inctax=(it*0.01)*grosssal;
netsal=grosssal-inctax-ded;
}
public void payslip()throws IOException
{
ob.calculate();
System.out.println("Printing monthly payslip for Employee - code : "+code);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("                                     MONTHLY PAYSLIP ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Name :                             "+name);
System.out.println("Basic Salary (in Rs.) :            "+bassal);
System.out.println("Medical Allowance (in Rs.) :       "+ma);
System.out.println("Dearness Allowance (in Rs.) :      "+da);
System.out.println("House Rent Allowance (in Rs.) :    "+hra);
System.out.println("Travel Allowance (in Rs.) :        "+ta);
System.out.println("Total Incentives (in Rs.) :        "+incentives);
System.out.println("Bonus (in Rs.) :                   "+bon);
System.out.println("Gross Salary (in Rs.) :            "+grosssal);
System.out.println("Income Tax Deductions (in Rs.) :   "+inctax);
System.out.println("Other Deductions (in Rs.) :        "+ded);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("Net Salary (in Rs.) :              "+netsal);
System.out.println();
System.out.println();
System.out.println("Press 1 to go back to the Menu :");
int ch=Integer.parseInt(br.readLine());
if(ch==1)
{
System.out.println("Processing............");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.menu();
System.out.println();
}
}
public void start()throws IOException
{
System.out.println("Processing............");
ob.delay();
System.out.println("\f");
ob.masthead1();
ob.EmployeeCheck();
System.out.println();
}
public void exit()throws IOException
{
System.out.println("Processing............");
ob.delay();
System.out.println("\f");
ob.masthead1();
System.out.println();
System.out.println();
System.out.println("                             !!!!!!!THANK YOU FOR USING!!!!!!!");
System.out.println("                                   !!!HAVE A NICE DAY!!!");
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.exit(0);
}
public static void main()throws IOException
{
ob.masthead();
}
}