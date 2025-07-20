import java.io.*;
class Lastname_Initials_str
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any sentence : "); //inputting the sentence
        String s=br.readLine();        
        int len=s.length(),i,j;String d="",p="";
        for(i=len-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            break;
        }
        p=s.substring(i+1)+" "+s.charAt(0);
        for(j=0;j<i-1;j++)
        {
            if(s.charAt(j)==' ')
            d=d+" "+s.charAt(j+1);
        }
        System.out.println(p+d);
    }
}