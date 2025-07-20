import java.io.*;
class cap_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i,k,k1;
        char ch,ch1;
        System.out.println("Enter any text :-  ");
        s=br.readLine();
        l=s.length();
        ch=s.charAt(0);
        k=(int)(ch);
        if((k>=97)&&(k<=122))
        {
                k=k-32;
                System.out.print((char)(k));
            }
            else
            {
                System.out.print((char)(k));
            }
                   for(i=1;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(s.charAt(i));
                ch1=s.charAt(i+1);
                k1=(int)(ch1);
                if((k1>=97)&&(k1<=122))
                {
                    k1=k1-32;
                    System.out.print((char)(k1));
                }
                else
                {
                    System.out.print(s.charAt(i));
                }
            }
            else if(s.charAt(i-1)!=' ')
            {
                       System.out.print(s.charAt(i));
            }
        }
    }
}