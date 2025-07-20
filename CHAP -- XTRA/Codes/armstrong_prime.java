import java.io.*;
class armstrong_prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num;
System.out.println("ENTER THE NUMBER");
       num=Integer.parseInt(br.readLine());
       int c=num,p=0;
       while(c>0)
       {
        p=p+((c%10)*(c%10)*(c%10));
        c=c/10;
    }
    if(p==num)
     for(c=2;c<=num/2;c++)
        if(num%c==0)
        break;
        if(c>num/2)
         for(c=2;c<=num/2;c++)
        if(num%c==0)
        break;
        if(c>num/2)
        System.out.println("THE NUMBER ENTERED BY YOU "+num+" IS A PRIME ARMSTRONG NUMBER");
        else
        System.out.println("THE NUMBER ENTERED BY YOU "+num+" IS NOT A PRIME ARMSTRONG NUMBER");
    }
}