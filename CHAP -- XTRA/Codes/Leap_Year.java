import java.io.*;
class Leap_Year
{
    public static void main(String args[])throws IOException
    {
        int year;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter The Number");
        year=Integer.parseInt(br.readLine());
        if(year%100==0)
        {
            if(year%400==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
        }
        else
        {
            if(year%4==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
        }
    }
}
        