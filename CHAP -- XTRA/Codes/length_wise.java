import java.io.*;
public class length_wise
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s,s1="",t;
        int x,i,c=0,k=0,j;
        System.out.println("Enter a String");
        s=in.readLine();
        s=s+" ";
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)==' ')
            c=c+1;
        }
        String a[]=new String[c];
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
            else
            {
                a[k]=s1;
                k=k+1;
                s1="";
            }
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<c-1-i;j++)
            {
                if(a[j].length()>a[j+1].length())
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<c;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
        