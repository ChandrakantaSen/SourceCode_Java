import java .io.*;
class LeapYear
{
public static void main(String args[])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("press 1 for Leapyear");
        System.out.println("press 2 for even or odd");
        int a=Integer.parseInt(br.readLine());
        switch (a)
        {
            case 1 :
               System .out .println("Enter a year");
               int y=Integer .parseInt(br.readLine());
               if(y%4==0)
               System.out.println("It is a leap year");
               else
               System. out. println("It is not a leap year");
            break;
            case 2:
               System .out .println("Enter a number");
               int n=Integer .parseInt(br.readLine());
               if(n%2==0)
               System.out.println("It is a even number");
               else
               System. out. println("It is a odd number");
            break;
            default :
                    System.out.println("It is a wropng choise");
        }
    }
}

