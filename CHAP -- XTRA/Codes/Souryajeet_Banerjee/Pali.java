/*import java.io.*;
class Palindrome
{
    void input(String s)
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s=s+" ";
        boolean flag=true;
        int len=s.length(),in=0,k;
        k = Integer.parseInt(br.readLine());
        char a,b; String s1="";
        System.out.println("Palindrome words : ");
        for(int i=0;i<len;i++)
        { a=s.charAt(i);
            if(a != i)
                s1=s1+a;
            else
            { 
                flag=true;
                in=s1.length();
                for(int j=0;j<(in/2); j++)
                {
                    while(k>=in-1)
                   {  
                       k--;
                   }
                    if((s1.charAt(j))== (s1.charAt(k)))
                        continue;
                    else
                    {
                        flag=false;
                        break;
                    } //else ends
                }//inner for ends
            if(flag==true)
                System.out.println(s1);
            s1="";
           }//else ends
        }//outer for ends
    }
}*/


public class Pali
{
    boolean Palindrome(int n)
    {
        int n1=n;
        int dig, q, n2=0;
        while(n1>0)
        {
            q=n1/10;
            dig=n1%10;
            n2=n2*10+dig;
            n1=q;
        }
        if(n2==n)
            return true;
        else
            return false;
    }
}