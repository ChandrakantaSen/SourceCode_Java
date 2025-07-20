import java.io.*;
public class DAY
{
    void daysofweek(int dysno)
    {
        
        switch(dysno)
        {
            case 1:
            System.out.print("Monday");
            break;
            case 2:
            System.out.print("Tuesday");
            break;
            case 3:
            System.out.print("Wednasday");
            break;
            case 4:
            System.out.print("Thusday");
            break;
            case 5:
            System.out.print("Friday");
            break;
            case 6:
            System.out.print("Saterday");
            break;
            case 7:
            System.out.print("Sunday");
            break;
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g;
        System.out.print("Enter the number{dysno}:- ");
        g=Integer.parseInt(br.readLine());
        DAY ob=new DAY();
        ob.daysofweek(g);
    }
}   