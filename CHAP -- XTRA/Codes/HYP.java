import java.io.*;
class HYP
{
public static void main(String args[])throws IOException
{
double R,n,year1,year2,Amt;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the Amount:-");
n=Integer.parseInt(br.readLine());
R=0.05;
year1=(n*R*1);
year2=year1+(n*R*1);
Amt=n*(1+R)+n*(1+R)+n*(1+R);
System.out.println("The amt. at the end of 1st year is" +year1);
System.out.println("The amt. at the end of 2nd year is" +year2);
System.out.println("The amt. at the end of 3 year is" +Amt);
    }
}