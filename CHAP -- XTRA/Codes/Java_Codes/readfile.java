import java.io.*;
import java.util.*;
class readfile
{
    public static void main(String args[])throws IOException
    {
        FileWriter fw=new FileWriter("R.txt");
        BufferedWriter br=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(br);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
        System.out.println("Enter the name");
        String nm=sc.next();
        System.out.println("Enter the roll");
        int roll= sc.nextInt();
        pw.println(nm);
        pw.println(roll);
    }
    
        br.close();
        
    }
}