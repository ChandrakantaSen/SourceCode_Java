import java.io.*;
class S_Don
{
    public static void main(String args[])throws IOException
    {
        String  s="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            for(int g=0;g<i*2;g++)
            {
                System.out.print(" ");
            }
            System.out.print(s.charAt(i));
            System.out.println();
        }
    }
}