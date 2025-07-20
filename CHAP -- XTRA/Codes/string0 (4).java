import java.io.*;
class string0
{
public static void main()throws IOException
{
    String s,p="";
    int i,k,l;
    char m=' ';
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    s=br.readLine();
    s=' '+s;
    l=s.length();
    for(i=0;i<l;i++)
    {
        m=s.charAt(i);
        if(m==' ')
        {
            p=p+" ";
            k=(int)(s.charAt(i+1));
            if((k>=65)&&(k<=90))
            {
                p=p+(char)(k+32);
            }
            else if((k>=97)&&(k<=122))
            {
               p=p+(char)(k-32);
            }
            i=i+1;
        }
        else
        {
            p=p+s.charAt(i);
        }
    }
    System.out.println(p);
}
}
            
        