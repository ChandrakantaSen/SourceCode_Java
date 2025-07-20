package string_progs;
import java.io.*;
class string_correct
{
    public static void main(String args[])throws IOException
    {
        String str="",str1="",t="";
        char b;
        int len,i;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        str=in.readLine();
        str=str+" ";
        len=str.length();
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b!=' ')
            { 
                t=t+b;
            }
            else
            {
                if(t.compareTo("26")==0)
                {
                    str1=str1+" "+"15";
                }
                else if(t.compareTo("January")==0)
                {
                    str1=str1+" "+"August";
                }
                else if(t.compareTo("Republic")==0)
                {
                    str1=str1+" "+"Independence";
                }
                else
                {
                    str1=str1+" "+t;
                }
                t="";
            }
        }
        System.out.println("Modified String is: ");
        System.out.println(str1);
    }
}