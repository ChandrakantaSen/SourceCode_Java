import java.io.*;
class emp1
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String[] s=new String[10];
    String[] add=new String[10];
     int[] basic=new int[10];
    float[] da=new float[10];
    float[] ta=new float[10];
    float[] total=new float[10];
    int n,i;
    System.out.println("enter number of employee");
    n=Integer.parseInt(br.readLine());
    for( i=0;i<n;i++)
    {
    System.out.println("Enter name of the employee........");
    s[i]=br.readLine();
    System.out.println("Enter address of the employee.....");
    add[i]=br.readLine();
    System.out.println("enter basic salry of employee.....");
    basic[i]=Integer.parseInt(br.readLine());
    da[i]=(35*basic[i])/100;
    ta[i]=(15*basic[i])/100;
    total[i]=da[i]+ta[i]+basic[i];
}
    System.out.println("............................LMIIT...............................");
    System.out.println("...........................PAYSLIP.............................");
    System.out.println();
    System.out.println("Name        Addresss      Basic       DA       TA        Total ");
    System.out.println();
    for( i=0;i<n;i++);
    {
    System.out.print("  "+s[i]);
    System.out.print("  "+add[i]);
    System.out.print("  "+basic[i]);
    System.out.print("  "+da[i]);
    System.out.print("  "+ta[i]);    
    System.out.print("  "+total[i]);
}
    System.out.println();
  }
}