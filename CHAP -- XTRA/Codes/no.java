import java.util.Scanner;
class no
{ 
    void display()
    { 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(),a=0;
      if(isPrime(n)==0)
      {a=isReverse(n);}
          if (isPrime(a)==0)
          System.out.println("twisted prime");
          else System.out.println("not a twisted prime");
    }
       int isPrime(int a)
       { int i,count=0;
           for(i=2;i<=a/2;i++)
           { if(a%i==0)
               count++;
            }
            if(count==0)
            return 0;return 1;
        }
        int isReverse(int a)
        {int y,r=0;
            while(a>0)
            { y=a%10;
              r=10*r+y;
              a/=10;
            }
            return r;
        }
    }        