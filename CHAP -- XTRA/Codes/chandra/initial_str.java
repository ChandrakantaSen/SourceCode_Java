import java.io.*;
public class initial_str
{
    public static void main()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        char ch;
        String s1,res=" ";
        int i,j,c=0;
        System.out.println("Enter the string ");
        s1=br.readLine();
        i=s1.length();
        res=res+s1.charAt(0)+'.';
        for(j=1;j<i;j++)
        {
            ch=s1.charAt(j);
            if(ch==' ')
                res=res+s1.charAt(j+1)+'.';
        }
        System.out.println(res);
    }
}