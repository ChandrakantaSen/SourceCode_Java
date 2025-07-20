package All;

import java.io.*;
import java.util.*;
public class RTextfile
{
    public static void main(String args[])throws IOException
    {
        FileWriter fin=new FileWriter("RV.txt");
        BufferedWriter ffin=new BufferedWriter(fin);
        Scanner sc=new Scanner(System.in);
        int p;
            String adm="",name1="",name2="",cl="";
        System.out.println("Enter 1 to display the records");
        System.out.println("Enter 2 to display the record getting the highest mark");
        System.out.println("Enter your choice");
        p=sc.nextInt();
        switch(p)
        {
            case 1:
            int i=0;
            int total;
            System.out.println("Dislay all the recrds of the file RV.txt");
            System.out.println("Adm.No      Name       Class      Total");
            Scanner s1=new Scanner("RV.txt");
            while(s1.hasNext())
            {
                adm=s1.next();
                name1=s1.next();
                name2=s1.next();
                cl=s1.next();
                total=s1.nextInt();
                System.out.println(adm+"\t\t"+name1+"\t\t"+name2+"\t\t"+total);
            }
            s1.close();
            break;
            case 2:
            int max=0;
            String ad="",n1="",c="",n2="";
            Scanner s2=new Scanner(new File("RV.txt"));
            while(s2.hasNext())
            {
                adm=s2.next();
                name1=s2.next();
                name2=s2.next();
                cl=s2.next();
                total=s2.nextInt();
                if(max<total)
            {
                max=total;
                ad=adm;
                n1=name1;
                n2=name2;
                c=cl;
            }
        }
        System.out.println("The record getting the highest marks:");
        System.out.println("Adm.No   Name      Class          Total");
        System.out.println(ad+"\t\t"+n1+"\t\t"+n2+"\t\t"+c+"\t\t"+max);
        break;
        default:
        System.out.println("Wrong choice");
    }
}
}
        
        
        
            
                
            
            
            
            