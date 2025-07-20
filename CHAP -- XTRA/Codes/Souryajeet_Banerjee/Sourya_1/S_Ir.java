import java.io.*;
class S_Ir
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        String s1="";
        System.out.print("Enter the name ");
        s=br.readLine();
        s=" "+s;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                s1=s1+s.charAt(i+1)+".";
            }
        }
        System.out.println("Innitials: "+s1);
        int l=s1.length();
        System.out.print("Reverse Innitials: ");
        while(l>0)
        {
            l=l-1;
            System.out.print(s1.charAt(l));
        }
    }
}