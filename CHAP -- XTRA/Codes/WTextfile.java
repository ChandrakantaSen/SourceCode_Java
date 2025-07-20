package All;

import java.io.*;
import java.util.*;
public class WTextfile
{
    public static void main(String args[])throws IOException
    {
        FileWriter fout=new FileWriter("RV.txt");
        BufferedWriter ffout=new BufferedWriter(fout);
        PrintWriter ob=new PrintWriter(ffout);
        Scanner in=new Scanner(System.in);
        int i;
        String adm,name1,name2,cl;
        int total;
        System.out.println("Enter Adm.no,Name,Class and Tota Marks");
        for(i=1;i<=3;i++)
        {
            System.out.println("Enter Adm.no");
            adm=in.next();
            System.out.println("Enter first name");
            name1=in.next();
            System.out.println("Enter surname");
            name2=in.next();
            System.out.println("Enter Class");
            cl=in.next();
            System.out.println("Enter Marks");
            total=in.nextInt();
            ob.println(adm);
            ob.println(name1);
            ob.println(name2);
            ob.println(cl);
            ob.println(total);
        }
        ffout.close();
    }
}
        
        
        