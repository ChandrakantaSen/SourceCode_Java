import java.io.*;
class Pig_Latin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s="",s1="",s2="";
        int f=0,p=0;
        System.out.print("Enter the name ");
        s=br.readLine();
        s=s.toUpperCase();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' ||ch=='I'||ch=='O'||ch=='U')
            {
                p=i;
                break;
            }
        }
        s1=s.substring(p,n);
        s2=s.substring(0,p);
        System.out.print(s1+s2+"AY.");
    }
}