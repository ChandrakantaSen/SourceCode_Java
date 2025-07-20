import java.io.*;
class switch_case_01
{
public static void main (String args[]) throws IOException
{
int ch;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println ("Enter your choice");
ch=Integer.parseInt (br.readLine());
switch(ch)
{
case 1:
System.out.println ("SUNDAY");
break;
case 2:
System.out.println ("MONDAY");
break;
case 3:
System.out.println ("TUESDAY");
break;
case 4:
System.out.println ("WEDNESDSAY");
break;
case 5:
System.out.println ("THRUSDAY");
break;
case 6:
System.out.println ("FRIDAY");
break;
case 7:
System.out.println ("SATURDAY");
break;
default:
System.out.println ("WRONG INPUT");
    }
}
    }