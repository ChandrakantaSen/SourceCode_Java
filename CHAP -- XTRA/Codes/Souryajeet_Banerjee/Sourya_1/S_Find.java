import java.io.*;
class S_Find
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int l=s.length();
        System.out.print("Enter the position of the string ");
        int n=Integer.parseInt(br.readLine());
        System.out.println(s.charAt(n));
    }
}