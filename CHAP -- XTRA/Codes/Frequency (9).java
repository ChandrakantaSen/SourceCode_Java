import java.util.*;
class Frequency
{
    String sent;
    int freq[]=new int[26];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        sent=sc.nextLine();
    }
    void count()
    {
        int j,ch;
        for(j=0;j<sent.length();j++)
        {
                ch=(int)sent.charAt(j);
                if((ch>=65)&&(ch<=90))
                {
                    freq[ch-65]++;
                }
                else if((ch>=97)&&(ch<=122))
                {
                    freq[ch-97]++;
                }
        }
    }
    void display()
    {
        int i,ch;
        String st1="";
        String st2="";
        System.out.println("The frequency of digits are :");
        for(i=0;i<sent.length();i++)
        {
                ch=(int)sent.charAt(i);
                if((ch>=65)&&(ch<=90))
                {
                    if(freq[ch-65]>0)
                    {
                        st1=st1+(char)ch+" ";
                        st2=st2+freq[ch-65]+" ";
                        freq[ch-65]=0;
                    }
                }
                else if((ch>=97)&&(ch<=122))
                {
                    if(freq[ch-97]>0)
                    {
                        st1=st1+(char)ch+" ";
                        st2=st2+freq[ch-97]+" ";
                        freq[ch-97]=0;
                    }
                }
        }
        System.out.println("Alphabet  : "+st1);
        System.out.println("Frequency : "+st2);
    }
    public static void main()
    {
        Frequency ob=new Frequency();
        ob.input();
        ob.count();
        ob.display();
    }
}