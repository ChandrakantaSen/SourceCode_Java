import java.io.*;
class l_wrd
{
    public static void main(String h[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence: ");
        String s=br.readLine();
        int p=0,d=0,a=0,c=0,z=0,q=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            a++;
            c=a+1;
            