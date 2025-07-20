import java.io.*;
class ShortForm
{
    public static void main(String args[])throws IOException
    {
        int len,c,d=0;
        String str,str1="";
        char b=' ';
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        str=br.readLine();

        len=str.length();
        str1=str1+str.charAt(0);

        System.out.println("The surname is ");
        for(int i=0;i<len;i++)
        {
            b=str.charAt(i);
            System.out.println("Char is: "+b);

            if(b==' ')
            {
                d=d+1;
            }
            if(d==1)
                str1=str1+"."+(str.charAt(i+1));
            else if(d==2)
                str=str1+"."+(str.substring(i+1,len));
            else
                str1=str1+b;
        }
        System.out.println(str1);
    }
}
