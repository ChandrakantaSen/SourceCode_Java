import java.io.*;
public class reverse
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",s2="",s3="";
        int x,i,j,len;
        System.out.println("Enter a string");
        s=in.readLine();
        s=s+" ";
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
            else
            {
                len=s1.length();
                for(j=0;j<len;j++)
                {
                    s2=s1.charAt(j)+s2;
                }
                s3=s3+s2+" ";
                s1="";
                s2="";
            }
        }
        System.out.println(s3);
    }
}
            
                
                
                    
                
                
        