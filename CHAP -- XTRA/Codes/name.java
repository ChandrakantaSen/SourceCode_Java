//(a)Write a program to create a file namely EMP.TXT for n employees working in an organization having the following details:

         
import java.io.*;
    public class name
    {
        public static void main(String args[])throws IOException
        {
        FileWriter fout=new FileWriter("EMP.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pr=new PrintWriter(bout);
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many employees");
        String x=buf.readLine();
        int n=Integer.parseInt(x);
        String nam[]=new String[n];
        String code[]=new String[n];
        String desi[]=new String[n];
        String basic[]=new String[n];
        int record[]=new int[n];
        int k=1;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name,code,designation,basic salary");
            nam[i]=buf.readLine();
            code[i]=buf.readLine();
            desi[i]=buf.readLine();
            basic[i]=buf.readLine();
            record[i]=k;
            k++;
        }
        for(int i=0;i<n;i++)
        {
            pr.println("record no.: "+record[i]);
            pr.println("code:       "+code[i]);
            pr.println("name:       "+nam[i]);
            pr.println("designation: "+desi[i]);
            pr.println("basic salary:"+basic[i]);
        }
        pr.close();
    }
}


            