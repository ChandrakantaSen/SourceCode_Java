import java.io.*;
public class digit2word
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 static int i,j,k,l;
 static String a,a1,a2;
  public static String number(int p1)
  {
      switch (p1)
      {
            case 1:
                a="One";
                break;
            case 2:
                a="Two";
                break;
            case 3:
                a="Three";
                break;
            case 4:
                a="Four";
                break;
            case 5:
                a="Five" ;   
                break;
            case 6:
                a="Six";
                break;
            case 7:
                a="Seven";
                break;
            case 8:
                a="Eight";
                break;
            case 9:
                a="Nine";
                break;
            }
            return a;
        }
public static String number1(int p2)
  {
      switch (p2)
      {
            case 11:
                a1="Eleven";
                break;
            case 12:
                a1="Twelve";
                break;
            case 13:
                a1="Thirteen";
                break;
            case 14:
                a1="Forteen";
                break;
            case 15:
                a1="Fifteen" ;   
                break;
            case 16:
                a1="Sixteen";
                break;
            case 17:
                a1="Seventeen";
                break;
            case 18:
                a1="Eighteen";
                break;
            case 19:
                a1="Nineteen";
                break;
            }
            return a1;
        }
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=50;
while(n>0)
    {   System.out.println("Enter any value (Upto 4 digit) :");
        n=Integer.parseInt(br.readLine());
        if (n>9999)
           {
               System.out.println("Number too large....Try again");
            }
            else
               {     
                    break;
                }
           
        }
int t=n;
int c=0;
int x=1000;
while (t>0)
    { int m=t%10;
      c=c+1;
      t=t/10;
    }
t=n;    
String b;
for(int j=1;j<=2;j++)
{
if (j==1 && t>999)
   {
     int p=t/1000;           
     b=number(p);
     System.out.println(b+" Thousand ");
     t=t-p*1000;
    }
if (j==2 && t>99)
   {
     int p=t/100;     
     b=number(p);
     System.out.println(b+" Hundred ");
     t=t-p*100;
    }
}
if (t>=11 && t<=19)
{   b=number1(t);
System.out.println(b);
}
    }
}
            