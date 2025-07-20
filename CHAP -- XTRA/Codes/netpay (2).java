import java.io.*;
class netpay
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
double bp,pf,np,gp,da,hra;
System.out.println("Enter the Basic Pay :-");
bp=Double.parseDouble(br.readLine ());
da=bp*2/100;
hra=bp*4/100;
pf=bp*7/100;
np=bp+da+hra;
gp=np-pf;
System.out.println("The Net Pay is:-"+np);
System.out.println("The Gross Pay :-"+gp);
if(gp>100000)
{
System.out.println("you are cream citizen");
    }
    else if((gp<=50000)&&(gp>=100000))
    {
        System.out.println("you are high mediocar");
    }
    else if((gp<=25000)&&(gp>=50000))
    {
        System.out.println("you are mediocar");
}
else if((gp<=5000)&&(gp>=25000))
    {
        System.out.println("you are low mediocar");
    }
    else
    {
        System.out.println("you are lower Case.");
    }
}
}
}