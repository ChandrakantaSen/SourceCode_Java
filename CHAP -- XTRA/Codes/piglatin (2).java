import java.io.*;
class piglatin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,y;
        String str="",str1="",str2="";
        char b;b=0;
        x=str.length();
        System.out.println("the piglatin word of the given string:-");
        for(y=0;y<x;y++)
        {
            b=(str.charAt(y));
            if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')

        str1= str.substring(y,x);
        str2=str.substring(0,y);
        {
            System.out.println(str1+str2+"ay");
        }
    }
}
}
         
        
    