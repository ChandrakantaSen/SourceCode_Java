import java.io.*;
class Ascii
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i;
        char ch;
        System.out.println("Enter any character :-  ");
        ch=(char)br.read();
        i=(int)(ch);
        System.out.println("The ASCII value of  "+ch+"  is  "+i);
    }
}
    