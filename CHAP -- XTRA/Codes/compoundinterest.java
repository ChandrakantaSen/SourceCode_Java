import java.io.*;
class compoundinterest
{
public static void main(String args[])throws IOException
{
double a,ci1,ci2,ci3,s;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the principle");
a=Double.parseDouble(br.readLine());
ci1=a*0.05;
ci2=(a+ci1)*0.05;
ci3=(a+ci1+ci2)*0.05;
s=a+ci1+ci2+ci3;
System.out.println("The interest for the first year is-"+ci1); 
System.out.println("The interest for the second year is-"+ci2);
System.out.println("Amount for the third year is-"+s);
    }
}
