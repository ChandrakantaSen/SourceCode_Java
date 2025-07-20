import java.io.*;
public class Test1
{
    public static void main(String args[])throws IOException
    {
        int eNo,basic;
        String eName,eDesig;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the employee number : ");
        eNo=Integer.parseInt(br.readLine());
        System.out.println("Enter the name of the employee : ");
        eName=br.readLine();
        System.out.println("Enter the designation of the employee : ");
        eDesig=br.readLine();
        System.out.println("Enter the basic salary ");
        basic=Integer.parseInt(br.readLine());
        Salary1 ob=new Salary1(eNo,eName,eDesig,basic);
        ob.calculate();
    }
}