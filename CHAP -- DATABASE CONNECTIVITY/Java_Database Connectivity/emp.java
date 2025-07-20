import java.io.*;
class emp
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s ,add;
    int basic;
    float da,ta,total;
    System.out.println("Enter name of the employee........");
    s=br.readLine();
    System.out.println("Enter address of the employee.....");
    add=br.readLine();
    System.out.println("enter basic salry of employee.....");
    basic=Integer.parseInt(br.readLine());
    da=(35*basic)/100;
    ta=(15*basic)/100;
    total=da+ta+basic;
    System.out.println("............................LMIIT...............................");
    System.out.println("...........................PAYSLIP.............................");
    System.out.println();
    System.out.println("Name:-           "+s);
    System.out.println("Address:-        "+add);
    System.out.println("Basic Salary:-   "+basic);
    System.out.println("DA:-             "+da);
    System.out.println("TA:-             "+ta);
    System.out.println();
    System.out.println("_________________________");
    System.out.println("Total:-          "+total);
  }
}