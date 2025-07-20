import java.io.*;
public class piglatin
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",s2="";
        int x,i,j,len,k=0;
        char ch;
        System.out.println("Enter a Sentence");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' '&&s.charAt(i)!='.')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
                len=s1.length();
                for(j=0;j<len;j++)
                {
                    ch=s1.charAt(j);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    {
                        s2=s2+" "+s1.substring(j)+s1.substring(0,j)+"ay";
                        k=k+1;
                        break;
                    }
                    
                    
                }
                if(k==0)
                {
                    s2=s2+" "+s1+"n";
                }
                s1="";
            }
           
        }
         System.out.println(s2);
    }
}

                        
                        
                    
                    
                
                