import java.util.*;
class Code4
{
 public static void main(String args[])
 {
 String st, sn="", st1="", st2="";
 int p;
 Scanner in=new Scanner(System.in);
 System.out.println("Enter a full name");
 st=in.nextLine();

 p=st.lastIndexOf(' ');
 sn=st.substring(p+1);
 st1=st.substring(0,p);
 st2=sn+" " +st1;
 System.out.println("Name as initial with surnamae:");
 System.out.println(st2);
 }
} 
