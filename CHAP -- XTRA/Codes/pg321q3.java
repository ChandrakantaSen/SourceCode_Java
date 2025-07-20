import java.io.*;               
class pg321q3
{
public static void main (String args[])throws IOException
{
int dysno;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your choice");
dysno=Integer.parseInt(br.readLine());
pg321q3 ob=new pg321q3();
ob.days_of_week(dysno);
}
public static void days_of_week(int dysno)
{
switch(dysno)
{
case 1:
System.out.println("Sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wednesday");
break;
case 5:
System.out.println("Thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
break;
default:
System.out.println("Wrong Choice");
}
}
}