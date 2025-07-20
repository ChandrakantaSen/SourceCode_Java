import java.io.*;
class amount
{
public static void main(String args[])throws IOException
{
double mp,cp,sp;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the marked price");
mp=Double.parseDouble(br.readLine());
cp=mp-(mp*0.1);
sp=cp+(cp*0.06);
System.out.println("the amount paid by the customer is"+sp);
    }
}
