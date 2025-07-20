import java.io.*;
class days
{
void daysofweek(int dysno)
{
switch(dysno)
{
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Wrong Input");
    }
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int d;
System.out.println("Enter the day no. of a week");
d=Integer.parseInt(br.readLine());
days ob=new days();
ob.daysofweek(d);
    }
}