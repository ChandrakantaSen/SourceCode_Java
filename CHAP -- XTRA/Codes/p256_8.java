/*CALCULATION OF THE TOTAL MONTHLY SALARY TO BE DRAWN BY AN EMPLOYEE TAKING AGE AND 
 * BASIC SALARY AS AN INPUT*/
import java.io.*;
class p256_8
{
public static void main(String args[])throws IOException
{
int a,bs;
double da=0.0,tms=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the age of the employee");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the basic salary of the employee");
bs=Integer.parseInt(br.readLine());
if(a<=40)
{
da=(0.2*bs);
tms=(.011*bs)+da;
}
else if((a>40)&&(a<=50))
{
da=(0.3*bs);
tms=(.0125*bs)+da;
}
else if((a>50)&&(a<=60))
{
da=(0.4*bs);
tms=(.015*bs)+da;
}
System.out.println("The total monthly salary to be drawn by ab employee is"+(int)(tms));
}
}