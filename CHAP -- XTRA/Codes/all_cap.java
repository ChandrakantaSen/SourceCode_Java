import java.io.*;
class all_cap
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i,k;
        System.out.println("Enter any text :-  ");
        s=br.readLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(s.charAt(i));
            }
            char ch=s.charAt(i);
            k=(int)(ch);
            if((k>=97)&&(k<=122))
            {
                k=k-32;
                System.out.print((char)(k));
            }
        }
    }
}