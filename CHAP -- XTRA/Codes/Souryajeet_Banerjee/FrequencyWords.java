import java.util.Scanner;
class FrequencyWords
    {
        void input()
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter main string");
            String s= scan.next();
            System.out.println("enter string to be searched");
            String f= scan.next();
            s=s+" ";
            int l=s.length();
            char a; int c=0;
            String s1=" ";
            for(int i=0;i<l;i++)
            {
                a=s.charAt(i);
                if(a!=i)
                s1=s1+a;
                else
                {
                    if(s1.equalsIgnoreCase(f)==true)
                    c++;
                    s1="";
                }
            }
            System.out.println("Frequency of the word "+f+" is "+c);
        }
    }