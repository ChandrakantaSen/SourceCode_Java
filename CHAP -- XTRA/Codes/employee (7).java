import java.io.*;
class employee
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public static void main()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    double x=Double.parseDouble(br.readLine());   
    double da=0.25*x;
    double hra=0.15*x;
    double pf=0.0833*x;
    double np=x+da+hra;
    double gp=np-pf;
     System.out.println("the gross salary is"+gp);
}
}