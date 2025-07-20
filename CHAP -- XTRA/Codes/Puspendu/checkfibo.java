package Puspendu;

import java.io.*;
class checkfibo
{
    public static void main()throws IOException
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
            