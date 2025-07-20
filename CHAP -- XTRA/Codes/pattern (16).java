import java.io.*;
class pattern
{
public static void main()throws IOException
{
    String s;
    int i,j,l,a=0,k;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    s=br.readLine();
    l=s.length();
    System.out.println("pattern");
    for(i=l-1;i>=0;i--)
    {
        for(j=0;j<=i;j++)
    {
        System.out.print(s.charAt(j));
    }
        for(j=0;j<a;j++)
    {
        System.out.print(s.charAt(j));
    }
    a=a+1;
    System.out.println();
    }
    System.out.println(s);
}
}
   