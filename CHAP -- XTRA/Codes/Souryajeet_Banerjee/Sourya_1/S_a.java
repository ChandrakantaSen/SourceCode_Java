import java.io.*;
class S_a
{
    public static void main(String args[])throws IOException
    {
        String  s1="";
        char s=' ';
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s1=br.readLine();
        int l1=s1.length();
        s1=s1.toLowerCase();
        System.out.print("Enter the charecter to be searched: ");
        s=(char)(br.read());
        int a=0;
        for(int i1=0;i1<l1;i1++)
        {
            char ch=s1.charAt(i1);
            if(ch==s)
            {
              a=a+1; 
            }
        }
        if(a>0)
        {
            System.out.println(s+" is present "+a+" times.");
        }
    }
}