import java.io.*;
class Salary
{
public static void main(String args[])throws IOException
{
double GS,NS,S,DA,HRA,PF;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
S=12000;
DA=S*0.4;
HRA=S*0.15;
PF=S*0.10;
GS=(S+DA+HRA);
NS=(GS-PF);
System.out.println("The Gross salary is "+GS);
System.out.println("The Net salary is "+NS);
}
    }