import java.io.*;
class A_Z
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            for(int g=1;g<l-i;g++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            { 
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}