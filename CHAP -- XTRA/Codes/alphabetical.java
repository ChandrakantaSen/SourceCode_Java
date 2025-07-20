import java.io.*;
public class alphabetical
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",s2="",s3="",fr="";
        int x,i,len,j;
        char ch;
        System.out.println("Enter a String");
        s=in.readLine();
        s=s+" ";
        x=s.length();
        for(i=0;i<x;i++)
        {
            ch=s.charAt(i);
            s1=s1+ch;
        }
        for(i=0;i<x;i++)
        {
            if(s1.charAt(i)!=' ')
            s2=s2+s1.charAt(i);
            else
            {
                for(char c='A';c<='Z';c++)
                {
                    len=s2.length();
                    for(j=0;j<len;j++)
                    {
                        if((s2.charAt(j)==c)||(s2.charAt(j)==c+32))
                        s3=s3+s2.charAt(j);
                    }
                }
                fr=fr+s3+" ";
                s3="";
                s2="";
            }
        }
        System.out.println(fr);
    }
}
                
       
                