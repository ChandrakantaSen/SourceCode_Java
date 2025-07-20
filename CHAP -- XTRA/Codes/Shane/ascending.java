import java.io.*;
public class ascending
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",t;
        int x,i,k=0,c=0,j;
        System.out.println("Enter a sentence");
        s=in.readLine();
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)==' '||s.charAt(i)=='.')
            {
                k=k+1;
            }
        }
        String a[]=new String[k];
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' '&&s.charAt(i)!='.')
            {
                s1=s1+s.charAt(i);
            }
            else
            {
                a[c]=s1;
                c=c+1;
                s1="";
            }
        }
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j].length()>a[j+1].length())
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
            
                
                
            