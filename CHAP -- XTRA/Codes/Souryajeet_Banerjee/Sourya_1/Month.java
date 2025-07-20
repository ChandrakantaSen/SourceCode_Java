import java.io.*;
class Month
{
    public static void main(String args[])throws IOException
    {
        String  s[]={" ","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the month number: ");
        int n =Integer.parseInt(br.readLine());
        System.out.print(s[n]);
    }
}