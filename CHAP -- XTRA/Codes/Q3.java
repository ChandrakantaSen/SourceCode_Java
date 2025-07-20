/*
 *3. WAP a menu driven program to accept a number and  check weather its a palindrome 
 *or a perfect number .
 */
import java.io.*;
class Q3
{
    public static void main() throws IOException
    {
        int temp,i,ch,n,d,rev =0,s=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number :- ");
        n = Integer.parseInt(br.readLine());
        System.out.println("1.Palindrome Number");
        System.out.println("2.Perfect Number");
        System.out.println("Enter your choice :- ");
        ch = Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
                      temp = n;
                      while(temp!=0)
                      {
                          d = temp%10;
                          rev = rev * 10 + d;
                          temp = temp/10;
                      }
                      if(rev == n)
                        System.out.println(n+" is a Palindrome Number");
                      else
                        System.out.println(n+" is not a Palindrome Number");
                      break;
            case 2:
                     for(i=1;i<n;i++)
                     {
                         if(n%i==0)
                         {
                             s = s + i;
                          }
                     }
                     if(s == n)
                        System.out.println(n+" is a Perfect Number");
                      else
                        System.out.println(n+" is not a Perfect Number");
                      break;
            default :
                      System.out.println("It's a Wrong choice");
        }
    }
}