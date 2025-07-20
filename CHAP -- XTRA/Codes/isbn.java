import java.io.*;
class isbn
{
public static void main()throws IOException
{
    String s,g="";
    int l,m,n,c=2,d,s1=0;
    char a;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the isbn code");
    s=br.readLine();
    l=s.length();
    a=s.charAt(l-1);
     if (l==10)
    {
      if(a=='X')
    {
        g=s.substring(0,(l-1));
    }
    else
    {
        g=s;
        c=1;
    }
    n=Integer.parseInt(g);
    m=n;
    while(m>0)
    {
        d=m%10;
        s1=s1+(c++*d);
        m=m/10;
    }
    if(c==9)
    {
        s1=s1+10;
    }
    if(s1%11==0)
    {
        System.out.println("VALID ISBN");
    }
    else
    {
        System.out.println("INVALID ISBN");
    }
   }
   else
   { 
       System.out.println("INVALID INPUT");
   }
}
}