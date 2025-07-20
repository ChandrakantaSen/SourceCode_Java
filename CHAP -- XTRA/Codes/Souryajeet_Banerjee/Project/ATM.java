package Project;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class ATM
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
static int k,count=0;
// --> Account Details
// A/C Holder names
String names[]={"Souryajeet Banerjee","Rohan Saha","Sourav Panday","Rick Mithy","Makgit Sen Gupta"};
// A/C Card number
static long card_num[]={9999,8888,7777,6666,5555};
// A/C Card PIN number
static int pin_num[]={1234,5678,9987,6543,2100};
// A/C Number
static long acc_no[]={888888885,888888886,888888887,888888889,888888889};
// A/C Balance
static long balance[]={1567000000,1567000,1567000,1567000,1567000};
// Arrays for generating Mini Statement
static String mini_state[]=new String[50];
static String date[]=new String[50];
static String time[]=new String[50];
// ....................................................
// MAIN FUNCTIONS BEGIN
// ....................................................
void masthead() // The header of the Bank
{
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd EEEEEEEEE',' yyyy ");
SimpleDateFormat timeformatter = new SimpleDateFormat(" hh:mm:ss a");
System.out.println("");
System.out.println("       ****************************************************************       ");
System.out.println("       ***            Welcome to State Bank of India's ATM          ***       ");
System.out.println("       ****************************************************************       ");
System.out.println("            Date - "+ dateformatter.format(calender.getTime()));
System.out.println("            Time - "+timeformatter.format(calender.getTime()));
System.out.println("       ****************************************************************       ");
System.out.println("");
}
void delay()
{
long i;
for(i=0;i<199999999;i++)
{}
}
int login()throws IOException // The login part of ATM
{
ATM ob=new ATM();
long card;
int pin,i,f=0;
System.out.print("                  >> Enter card number - ");
card=Long.parseLong(in.readLine());
System.out.print("                  >> Enter PIN - ");
pin=Integer.parseInt(in.readLine());
System.out.println("                  ----------------------------------------------------------------        ");
System.out.println("                  Processing request...");
ob.delay();
for(i=0;i<5;i++)
{
if ((card==card_num[i]) && (pin==pin_num[i]))
{
f=1;
k=i;
break;
}
}
if (f==1)
return(1);
else
return(0);
}
void options()throws IOException // The various options of ATM
{
ATM ob=new ATM();
int opn;
System.out.println("                  Welcome "+names[k]);
System.out.println("                  Your A/C no: is "+acc_no[k]);
System.out.println("                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~        ");
System.out.println("                  >>> [1]. Cash Withdrawal ");
System.out.println("");
System.out.println("                  >>> [2]. Fast Cash ");
System.out.println("");
System.out.println("                  >>> [3]. Cash Deposit ");
System.out.println("");
System.out.println("                  >>> [4]. Balance Enquiry ");
System.out.println("");
System.out.println("                  >>> [5]. Mini Statement ");
System.out.println("");
System.out.println("                  >>> [6]. Funds Transfer ");
System.out.println("");
System.out.println("                  >>> [7]. Change PIN ");
System.out.println("");
System.out.println("                  >>> [8]. Exit ");
System.out.println("                  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~        ");
System.out.print("                  Your Choice - ");
opn=Integer.parseInt(in.readLine());
switch(opn)
{
case 1:
System.out.print("\f");
ob.masthead();
ob.withdraw();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 2:
System.out.print("\f");
ob.masthead();
ob.fastcash();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 3:
System.out.print("\f");
ob.masthead();
ob.deposit();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 4:
System.out.print("\f");
ob.masthead();
ob.balance_enq();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 5:
System.out.print("\f");
ob.masthead();
ob.ministate();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 6:
System.out.print("\f");
ob.masthead();
ob.transfer();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 7:
System.out.print("\f");
ob.masthead();
ob.pin_change();
System.out.print("\f");
ob.masthead();
ob.options();
break;
case 8:
System.out.print("\f");
ob.masthead();
ob.exit();
break;
default:
System.out.println("                  Wrong choice. Please select again.");
ob.delay();
System.out.print("\f");
ob.masthead();
ob.options();
}
}
void withdraw()throws IOException // Withdraw Money
{
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd'/'MM ");
SimpleDateFormat timeformatter = new SimpleDateFormat(" HH:mm ");
ATM ob=new ATM();
long amt,bal,z;
System.out.println("                  ==========================  ");
System.out.println("                  CASH WITHDRAWAL ");
System.out.println("                  ==========================  ");
System.out.print("                  Enter amount to withdraw - Rs.");
amt=Long.parseLong(in.readLine());
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Please wait while we process your request...");
ob.delay();
if (amt>balance[k])
{
System.out.println("                  You do not have sufficient balance in your account.");
for(z=1;z<=1000000000;z++){}
System.out.print("\f");
ob.masthead();
ob.withdraw();
}
else if (amt>25000)
{
System.out.println("                  The daily limit for cash withdrawal is Rs.25000 .");
for(z=1;z<=1000000000;z++){}
System.out.print("\f");
ob.masthead();
ob.withdraw();
}
else
{
balance[k]=balance[k]-amt;
mini_state[count]="Withdrawn Rs."+amt;
date[count]=dateformatter.format(calender.getTime());
time[count]=timeformatter.format(calender.getTime());
count++;
System.out.println("");
System.out.println("                  You have withdrawn Rs."+amt+" from your account.");
System.out.println("                  Please collect the cash.");
System.out.println("                  Current Balance - Rs."+balance[k]);
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
}
}
void fastcash()throws IOException // Withdraw money through FastCash
{
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd'/'MM ");
SimpleDateFormat timeformatter = new SimpleDateFormat(" HH:mm ");
ATM ob=new ATM();
long z;
int ch;
int fast[]={100,500,1000,5000};
System.out.println("                  ==========================  ");
System.out.println("                  FAST CASH WITHDRAWAL ");
System.out.println("                  ==========================  ");
System.out.println("                  Please select a desired amount.");
System.out.println("                  (1) Rs. 100 ");
System.out.println("                  (2) Rs. 500 ");
System.out.println("                  (3) Rs. 1000 ");
System.out.println("                  (4) Rs. 5000 ");
System.out.print("                  Your choice ? ");
ch=Integer.parseInt(in.readLine());
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Please wait while we process your request...");
ob.delay();
if (fast[ch-1]>balance[k])
{
System.out.println("                  You do not have sufficient balance in your account.");
for(z=1;z<=1000000000;z++){}
System.out.print("\f");
ob.masthead();
ob.fastcash();
}
else
{
switch(ch)
{
case 1:
balance[k]=balance[k]-fast[ch-1];
break;
case 2:
balance[k]=balance[k]-fast[ch-1];
break;
case 3:
balance[k]=balance[k]-fast[ch-1];
break;
case 4:
balance[k]=balance[k]-fast[ch-1];
break;
}
mini_state[count]="Withdrawn Rs."+fast[ch-1];
date[count]=dateformatter.format(calender.getTime());
time[count]=timeformatter.format(calender.getTime());
count++;
System.out.println("");
System.out.println("                  You have withdrawn Rs. "+fast[ch-1]+" from your account.");
System.out.println("                  Please collect the cash.");
System.out.println("                  Current Balance - Rs."+balance[k]);
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
}
}
void deposit()throws IOException // Deposit Money
{
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd'/'MM ");
SimpleDateFormat timeformatter = new SimpleDateFormat(" HH:mm ");
ATM ob=new ATM();
long amt,z;
System.out.println("                  ==========================  ");
System.out.println("                  CASH DEPOSIT ");
System.out.println("                  ==========================  ");
System.out.print("                  Enter amount to deposit - Rs.");
amt=Long.parseLong(in.readLine());
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Please wait while we process your request...");
ob.delay();
mini_state[count]="Deposited Rs."+amt;
date[count]=dateformatter.format(calender.getTime());
time[count]=timeformatter.format(calender.getTime());
count++;
System.out.println("");
System.out.println("                  You have deposited Rs."+amt+" to your account.");
System.out.println("                  The amount will be credited shortly.");
System.out.println("                  Current Balance - Rs."+balance[k]+" + Rs."+amt);
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
}
void balance_enq()throws IOException // Balance Enquiry
{
ATM ob=new ATM();
long amt,z;
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd'/'MM'/'yyyy ");
System.out.println("                  ==========================  ");
System.out.println("                  BALANCE ENQUIRY ");
System.out.println("                  ==========================  ");
System.out.println("                  Date - "+dateformatter.format(calender.getTime()));
System.out.println("                  Account Number - "+acc_no[k]);
System.out.println("                  Available Balance - Rs."+balance[k]);
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Please collect the reciept...");
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
}
void ministate()throws IOException // Generate MiniSatement
{
ATM ob=new ATM();
long amt,z;
int i;
System.out.println("                  ==========================  ");
System.out.println("                  MINI STATEMENT ");
System.out.println("                  ==========================  ");
System.out.println("                  Here are the details of your last 10 transactions.");
System.out.println("");
System.out.println("                  A/C Number - "+acc_no[k]);
System.out.println("                  Name - "+names[k]);
System.out.println("                  Date \t\t Time \t\t Details");
System.out.println("                  ---- \t\t ---- \t\t -------");
for (i=0;i<10;i++)
System.out.println("                 "+date[i]+"\t"+time[i]+"\t\t"+mini_state[i]);
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Your present Balance is Rs."+balance[k]);
System.out.println("                  Please collect the reciept...");
for(z=1;z<=1000000000;z++)
{
for (int h=1;h<=2;h++);
}
for(z=1;z<=1000000000;z++){}
}
void transfer()throws IOException // Money transfer
{
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd'/'MM ");
SimpleDateFormat timeformatter = new SimpleDateFormat(" HH:mm ");
ATM ob=new ATM();
long amt,rcv_acc,z;
int i,f=0,c=0;
System.out.println("                  ==========================  ");
System.out.println("                  CASH TRANSFER ");
System.out.println("                  ==========================  ");
System.out.print("                  Type the account no: of the reciever - ");
rcv_acc=Long.parseLong(in.readLine());
System.out.print("                  Enter the amount to be transferred - Rs.");
amt=Long.parseLong(in.readLine());
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Please wait while we process your request...");
ob.delay();
System.out.println("");
if (amt>balance[k])
{
System.out.println("                  You do not have sufficient balance in your account.");
for(z=1;z<=1000000000;z++){}
System.out.print("\f");
ob.masthead();
ob.transfer();
}
else
{
for (i=0;i<5;i++)
{
if (rcv_acc==acc_no[i])
{
c=1;
f=i;
break;
}
}
if (c==1)
{
balance[f]=balance[f]+amt;
balance[k]=balance[k]-amt;
}
else
{
System.out.println("                  Please enter a valid Account Number of the reciever.");
for(z=1;z<=1000000000;z++){}
ob.delay();
System.out.print("\f");
ob.masthead();
ob.transfer();
}
mini_state[count]="Transfered Rs."+amt+" to A/C no: "+acc_no[f];
date[count]=dateformatter.format(calender.getTime());
time[count]=timeformatter.format(calender.getTime());
count++;
System.out.println("                  Money is successfully transfered.");
System.out.println("                  To A/C number - "+acc_no[f]);
System.out.println("                  From A/C number - "+acc_no[k]);
System.out.println("                  Amount transferred - Rs."+amt);
System.out.println("                  Your present balance is Rs."+balance[k]);
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
ob.delay();
}
}
void pin_change()throws IOException // To change the PIN
{
ATM ob=new ATM();
int pre_pin,new_pin,i,c=0;
long z;
System.out.println("                  ==========================  ");
System.out.println("                  PIN CHANGE ");
System.out.println("                  ==========================  ");
System.out.print("                  Enter your existing PIN - ");
pre_pin=Integer.parseInt(in.readLine());
System.out.print("                  Enter a new PIN - ");
new_pin=Integer.parseInt(in.readLine());
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
System.out.println("                  Please wait while we process your request...");
ob.delay();
if (pre_pin==pin_num[k])
c=1;
else
{
System.out.println("                  Please enter your valid PIN to continue.");
ob.delay();
ob.delay();
System.out.print("\f");
ob.masthead();
ob.pin_change();
}
if (c==1)
{
pin_num[k]=new_pin;
System.out.println("");
System.out.println("                  PIN successfully changed.");
System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
}
for(z=1;z<=1000000000;z++){}
for(z=1;z<=1000000000;z++){}
}
void exit() // To Exit the ATM
{
System.out.println("                      ==============================  ");
System.out.println("                              (:)  THANK YOU  (:)     ");
System.out.println("                              Please Visit Again!");
System.out.println("                      ==============================  ");
}
public static void main(String args[])throws IOException
{
ATM ob=new ATM();
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int g=0,opn;
while (g!=1)
{
ob.masthead();
g=ob.login();
if (g==0)
{
System.out.println("                  Wrong CARD NUMBER or PIN. Please re enter your details.");
ob.delay();
System.out.print("\f");
}
else
{
System.out.println("                  Successfully logged in!");
ob.delay();
System.out.print("\f");
ob.masthead();
ob.options();
}
}
}
}