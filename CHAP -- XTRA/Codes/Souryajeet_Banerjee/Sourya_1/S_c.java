import java.io.*;
class S_c
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name:-");
        s=br.readLine();
        int n=s.length();
        s=s.toLowerCase();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                System.out.print("b");
            }
            else if(ch=='e')
            {
                System.out.print("f");
            }
            else if(ch=='i')
            {
                System.out.print("j");
            }
            else if(ch=='o')
            {
                System.out.print("p");
            }
            else if(ch=='u')
            {
                System.out.print("v");
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}