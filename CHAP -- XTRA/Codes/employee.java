import java.io.*;
class employee
{
public static void main(String args[])throws IOException
{
int b;
double dra,hra,pf,np,gp;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the bassic pay");
b=Integer.parseInt(br.readLine());
dra=b*0.25;
hra=b*0.15;
pf=b*0.0833;
np=b+dra+hra;
gp=np-pf;
System.out.println("The gross pay of an employee is:-"+gp);
    }
}