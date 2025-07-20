import java.io.*;
class Frequency
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i,j,fr=0,flag=0;
        System.out.println("Enter a sentence  ");
        s=br.readLine();
        l=s.length();
        System.out.println("Characters \t Frequency ");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            if(s.charAt(i)==s.charAt(j))
            fr=fr+1;
            for(j=i-1;j>=0;j--)
            if(s.charAt(i)==s.charAt(j))
            flag=1;
            if(flag!=1)
            System.out.println(s.charAt(i)+"\t\t\t"+fr);
            fr=0;
            flag=0;
        }
    }
}