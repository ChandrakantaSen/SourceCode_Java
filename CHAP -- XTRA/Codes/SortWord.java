import java.util.*;
class SortWord
{
    static String txt,c="";
    static int len;
    static Scanner sc=new Scanner(System.in);
    SortWord()
    {
        txt="";
        len=0;
    }
    static void readTxt()
    {
        System.out.println("Enter the word in lower case");
        txt=sc.next();
    }
    static void sortTxt()
    {
        int i,j;
        char k;
        len=txt.length();
        char a[]=new char[len];
        for(i=0;i<len;i++)
        {
            a[i]=txt.charAt(i);
        }
        for(i=1;i<len;i++)
        {
            for(j=0;j<len-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                }
            }
        }
        txt="";
        System.out.println("The word after sorting is");
        for(i=0;i<len;i++)
        {
            txt=txt+a[i];
        }
        System.out.println(txt);
    }
    static void changeTxt()
    {
        char k;
        int m,i;
        for(i=0;i<len;i++)
        {
            k=txt.charAt(i);
            m=(int)k;
            if((k=='a')||(k=='e')||(k=='i')||(k=='o')||(k=='u'))
            {
                c=c+(char)(m-32);
            }
            else
            {
                c=c+k;
            }
        }
    }
    static void disp()
    {
        System.out.println("The new string is:-");
        System.out.println(c);
    }
}