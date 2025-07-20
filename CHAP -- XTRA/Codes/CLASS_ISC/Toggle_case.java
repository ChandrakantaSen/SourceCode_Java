import java.util.*;
class Toggle_case
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence :-");
        String sent=sc.nextLine();
        int i,n;
        String str="";
        for(i=0;i<sent.length();i++)
        {
            n=(int)sent.charAt(i);
            if((n>=65)&&(n<=90))
            str=str+(char)(n+32);
            else if((n>=97)&&(n<=122))
            str=str+(char)(n-32);
            else
            str=str+(char)n;
        }
        System.out.println("The string in toggle case :"+str);
    }
}