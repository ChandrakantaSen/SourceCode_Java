import java.io.*;
class string
{
public static void main()throws IOException
{
    String s,k="",p="";
    int l,i,c=0,j;
    char m=' ';
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    s=br.readLine();
    s=s+' ';
    l=s.length();  
    System.out.println("PALINDROME");
    for(i=0;i<l;i++)
    {
        m=s.charAt(i);
        if((m==' ')||(m==',')||(m=='.')||(m=='?')||(m=='!'))
        {
            k=s.substring(c,i);  
        for(j=k.length()-1;j>=0;j--)
            {
                p=p+k.charAt(j);
            }
            if(k.compareTo(p)==0)
            {
                System.out.println(k);
            }
        k="";
        p="";
        c=i+1;
        }
    }
}
}