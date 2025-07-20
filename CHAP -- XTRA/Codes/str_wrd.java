import java.io.*;

class str_wrd
{
    public static void main(String args[])throws IOException
    {
        String str,str1="";
        int len,i;
        char b;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        str = in.readLine();
        str = str+" ";
        len = str.length();
        
        for(i=0;i<len;i++)
        {
            b = str.charAt(i);
            if(b!=' ')
            {
                str1 = str1 + b;
                continue;
            }
            System.out.println("Word is: "+str1);
            str1="";
        }
    }
}