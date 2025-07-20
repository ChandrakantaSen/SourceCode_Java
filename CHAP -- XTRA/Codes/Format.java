import java.io.*;
class Format
{
    String str;
    int len;
    Format()
    {
        str="";
        len=0;
    }
    void redstring()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string : ");
        str=br.readLine();
    }
    char charat(int index)
    {
        char ch;
        ch=str.charAt(index);
        return ch;
    }
    void writechar(char c)
    {
        System.out.print(c);
    }
    void writenewline()
    {
        System.out.print("\n");
    }
    int isupper(char c)
    {
        if(c >=65 && c<=90)
        return 1;
        else
        return 0;
    }
    int isendofsentence(str,)