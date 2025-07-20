import java.io.*;
class srt_3
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j;
        String c;
        String s[]=new String[10];
        for(i=0;i<10;i++)
        {
        System.out.println("Enter the name:");
        s[i]=br.readLine();
        }
        for(i=0;i<9;i++)
        {
            for(j=i+1;j<10;j++)
            {
                if(s[i].compareTo(s[j])>0)
                {
                    c=s[i];
                    s[i]=s[j];
                    s[j]=c;
                }
            }
        }
        System.out.println("DISPLAY:");
        for(i=0;i<10;i++)
        {
        System.out.println(s[i]);
        }
    }
}