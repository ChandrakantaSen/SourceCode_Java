import java.util.*;
class Longest_word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence :-");
        String sent=sc.nextLine();
        sent=sent.trim();
        int i,count=0;
        for(i=0;i<sent.length();i++)
        {
            if(sent.charAt(i)==' ')
            count++;
        }
        String arr[]=new String[count+1];
        int max=0,index=0;
        count=0;
        sent=sent+" ";
        for(i=0;i<arr.length;i++)
        arr[i]="";
        for(i=0;i<sent.length();i++)
        {
            if(sent.charAt(i)==' ')
            {
                if(count>max)
                {
                    max=count;
                }
                index++;count=0;
            }
            else
            {
                arr[index]+=sent.charAt(i);
                count++;
            }
        }
        System.out.println("The words with most alphabets ("+max+" alphabets) are :");
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].length()>=max)
            {
                System.out.println(arr[i]);
            }
        }
    }
}