package Puspendu;

import java.util.*;
import java.io.*;
class choice
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1: To remove 0s from a number");
        System.out.println("Press 2: To compute frequency of digits");
        System.out.println("Press 3: To check whether a number is in the Fibonacci Series or not");
        System.out.println("Please enter your choice :");
        int n=Integer.parseInt(br.readLine());
        choice ob=new choice();
        switch(n)
        {
            case 1:
            ob.nozero();
            break;
            case 2:
            ob.digfreq();
            break;
            case 3:
            ob.checkfibo();
            break;
            default:System.out.println("Wrong Choice");
        }
    }
    public void nozero()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number :");
        int n=sc.nextInt();
        String num=Integer.toString(n);String news="";
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            if(ch=='0')
            {
                continue;
            }
            else
            {
            news=news+ch;
            }
        }
        System.out.println("The number with the 0s removed is : "+news);
    }
    public void digfreq()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number to compute the frequency of its digits :");
        int n=Integer.parseInt(br.readLine());
        int d,ds,ctr=0,m=n;
       for(int i=0;i<=9;i++)
       {
           while(m>0)
           {
               d=m%10;
               if(d==i)
               {
                   ctr++;
                }
                m=m/10;
            }
            m=n;
            if(ctr==0)
            continue;
            else
            System.out.println("The frequency of "+i+" is "+ctr);
            ctr=0;
        }
    }
    public void checkfibo()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number to check whether it is present in the Fibonacci Series :");
        int n=Integer.parseInt(br.readLine());
        int a=0,b=1,c=0,flag=0;
        while(c<=n)
        {
            if(a==n){
            flag=1;
            break;
        }
        c=a+b;
        b=a;
        a=c;
    }
    if(flag==1)
    System.out.println(n+" is present in the Fibonacci Series");
    else
    System.out.println(n+" is not present in the Fibonacci Series");
}
        }