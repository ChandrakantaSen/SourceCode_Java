import java.io.*;
import java.util.Scanner;
public class KaprekarNumber
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        
        int tn=n,ctr=0;

        int sq = n*n; //finding the square of the number 
        
        while(tn!=0)
        {
            tn=tn/10;
            ctr++;
        }
        
        int p=(int)(sq/Math.pow(10,ctr));
        int q=(int)(sq%Math.pow(10,ctr));
        
        if(p+q==n)
            System.out.println("Number is Kaprekar number");
        else
            System.out.println("Number is Not Kaprekar number");
    }
}