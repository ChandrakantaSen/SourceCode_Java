import java.io.*;
import java.lang.*;
class day6
{
public static void main(String args[])throws IO Exception
{
int choice;
BufferedReader br=new BufferedReader(newIntegerStreamReader(System.in));
System.out.println("Enter your choice 1-7");
choice=Integer.parseInt(br.readLine());
//choice=(char)br.readline();
switch(choice)
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
        System.out.println("wednesday");
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
        System.out.println("Invalid input");
        break;
       }

}
}


