import java.io.*;
class CI
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double ci,a,p,n,r,c;
        System.out.print("Enter the time(n) = ");
        n=Double.parseDouble(br.readLine());
        System.out.print("Enter the rate(r) = ");
        r=Double.parseDouble(br.readLine());
        System.out.print("Enter the principal(p) = ");
        p=Double.parseDouble(br.readLine());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        c=((100+r)/100);
        System.out.println("Amount(a) of "+n+"  year {    a = p * ( 1 + r / 100 )^n}");
        System.out.println("                         => a = "+p+" * 1 + ("+r+" / 100 )^"+n);
        System.out.println("                         => a = "+p+" * "+c+"^"+n);
        double b=Math.pow(c,n);
        System.out.println("                         => a = "+p+" * "+b);
        a=p*b;
        System.out.println("                         => a = "+a);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        ci=a-p;
        System.out.println("CompoundInterest of "+n+" year  ci = a - p");
        System.out.println("                           => ci = "+a+" - "+p);
        System.out.println("                           => ci = "+ci);
    }
}