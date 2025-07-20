import java.io.*;
public class consecutive
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="";
        int x,c=0,len,j,k=0,i;
        char ch;
        System.out.println("Enter a String in upper case");
        s=in.readLine();
        s=s+" ";
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(i!=x-1)
            {
                if((s.charAt(i+1))==(s.charAt(i)+1))
                {
                    c=c+1;
                }
            }
        }
        System.out.println("Pairs of consecutive letters="+c);
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' ')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
                len=s1.length();
                for(j=0;j<len;j++)
                {
                    ch=s1.charAt(j);
                    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    {
                        k=k+1;
                    }
                }
                System.out.println(s1+"-"+k);
                k=0;
                s1="";
            }
        }
    }
}
            
                
            
                
        