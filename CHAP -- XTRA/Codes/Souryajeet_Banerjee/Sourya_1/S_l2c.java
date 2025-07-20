import java.io.*;
class S_l2c
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1="";
        String s2="";
        System.out.print("Enter the name 1 ");
        s1=br.readLine();
        System.out.print("Enter the name 2 ");
        s2=br.readLine();
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2)
        {
            System.out.print("the greatest string is s1 "+s1);
        }
        else
        {
            System.out.print("the greatest string is s2 "+s2);
        }
    }
}