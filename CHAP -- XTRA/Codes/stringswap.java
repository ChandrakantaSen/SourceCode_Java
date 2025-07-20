import java.io.*;
class stringswap
{
public static void main()throws IOException
{
    String s,p;
    int m,l,n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the first string");
    s=br.readLine();
    System.out.println("Enter the second string");
    p=br.readLine();
    l=s.length();
    m=p.length();
    s=s+p;
    n=m+l;
    System.out.println(s.substring(l,n));
    System.out.println(s.substring(0,l));
}
}