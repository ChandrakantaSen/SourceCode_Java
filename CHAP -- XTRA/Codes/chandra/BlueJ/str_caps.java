import java.io.*;

class str_caps
{
    void caps()throws IOException
    {
        String str,str1="",str2="",str3="";
        char b;
        int i,len;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string:");
        str = in.readLine();
        //str = " "+str;
        len = str.length();
        for(i=0;i<len;i++)
        {
            b = str.charAt(i);
            if(Character.isUpperCase(b)==true)
            {
                if(b!=' ')
                {
                    str1 = str1 + b;
                }
            }
            else
            {
                if(b!=' ')
                {
                    str2 = str2 +b;
                }
            }
        }
        str3=str2+""+str1;
        System.out.println("String is: "+str3);
    }

    public static void main(String args[])throws IOException
    {
        str_caps obj = new str_caps();
        obj.caps();
    }
}