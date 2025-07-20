import java.io.*;
class all
{
    static int i,n,m,s,d,j,fact;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void arm()throws IOException
    {
        System.out.println("Enter the range :- ");
        n=Integer.parseInt(br.readLine());
        for(i=100;i<=n;i++)
        {
        m=i;
        d=0;
        s=0;
        while(m>0)
        {
            d=m%10;
            s=s+(d*d*d);
            m=m/10;
        }
        if(s==i)
        {
        System.out.println(i);
}
    }
}
    public static void krish()throws IOException
    {
        System.out.println("Enter the range : - ");
        n=Integer.parseInt(br.readLine());
        System.out.println("The krishnamurthy numbers are as follows :- ");
        for(i=100;i<=n;i++)
        {
            m=i;
            s=0;
            while(m>0)
            {
                d=m%10;
                fact=1;
                for(j=1;j<=d;j++)
                {
                    fact=fact*j;
                }
                s=s+fact;
                m=m/10;
                if(s==i)
                {
                    System.out.println(i);
                }
            }
    }
}
    public static void palindrome()throws IOException
    {
        
        System.out.println("Enter the range : - ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Palindrome numbers are as follows :- ");
        for(i=11;i<=n;i++)
        {
            m=i;
            s=0;

     while(m>0)
     {
         d=m%10;
         s=(s*10)+d;
         m=m/10;
        }
        if(s==i)
        {
            System.out.println(i);
        }
    }
}
    public static void perfect()throws IOException
    {
        
        System.out.println("Enter the range :- ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Perfect numbers are as follows :- ");
        for(i=1;i<=n;i++)
        {
            s=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    s=s+j;
                }
            }
            if(s==i)
            {
                System.out.println(i);
            }
        }
    }
    public static void magic()throws IOException
    {
         
        System.out.println("Enter the range : - ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Magic numbers are as follows :- ");
        for(i=10;i<=n;i++)
        {
            m=i;
            s=0;
            while(m>0)
            {
                d=m%10;
                s=s+d;
                m=m/10;
            }
            if((s==10)||(s==1))
            {
                System.out.println(i);  
            }  
        }
    }
        public static void reverse()throws IOException
        {
            
            System.out.println("Enter the range : - ");
            n=Integer.parseInt(br.readLine());
           System.out.println("The reverse number are as follows  ");
           for(i=10;i<=n;i++)
           {
               m=i;
               s=0;
               while(m>0)
               {
                   d=m%10;
                   s=(s*10)+d;
                   m=m/10;
                }
                System.out.println(s); 
            }
        }
        public static void factorial()throws IOException
        {
            
            System.out.println("Enter the range : - ");
            n=Integer.parseInt(br.readLine());
            for(i=1;i<=n;i++)
                {
                 fact=1;
                 for(j=1;j<=i;j++)
                 {
                     fact=fact*j;
                    }
                 System.out.println("Factorial of the number "+i+ " is = "+fact);   
                }
        }
        public static void sumdigit()throws IOException
        {
           
            System.out.println("Enter the range");
            n=Integer.parseInt(br.readLine());
            System.out.println("Sum of the digits :- ");
            for(i=100;i<=n;i++)
            {
                m=i;
                s=0;
                d=0;
                while(m>0)
                {
                    d=m%10;
                    s=s+d;
                    m=m/10;
                }
                System.out.println("The sum of the digits of "+i+" is = " +s);
            }
        }
        public static void main()throws IOException
        {
            all ob=new all();
              int ch;
System.out.println("__________________________________________________________");
System.out.println("WELCOME TO NUMBER FORMAT SYSTEM ");              
System.out.println("__________________________________________________________");
do
{
System.out.println("__________________________________________________________");
System.out.println("________________MENU_______________________________________");
System.out.println("PRESS 1 FOR CHECKING THE AMSTRONG NUMBER . ");
System.out.println("PRESS 2 FOR CHECKING THE KRISHNAMURTY NUMBER . ");
System.out.println("PRESS 3 FOR CHECKING THE PALINDROME NUMBER . ");
System.out.println("PRESS 4 FOR CHECKING THE PERFECT NUMBER . ");
System.out.println("PRESS 5 FOR CHECKING THE MAGIC NUMBER . ");
System.out.println("PRESS 6 FOR CHECKING THE REVERSE OF A NUMBER . ");
System.out.println("PRESS 7 FOR CHECKING THE FACTORIAL OF A NUMBER . ");
System.out.println("PRESS 8 FOR CHECKING THE SUM OF THE DIGIT OF A NUMBER . ");
System.out.println("PRESS 9 FOR EXIT . ");
System.out.println("__________________________________________________________");
System.out.println("ENTER YOUR CHOICE : - ");
ch=Integer.parseInt(br.readLine());
if(ch==9)
{
break;
    }
switch(ch)
{
case 1:
ob.arm();
break;
case 2:
ob.krish();
break;
case 3:
ob.palindrome();
break;
case 4:
ob.perfect();
break;
case 5:
ob.magic();
break;
case 6:
ob.reverse();
break;
case 7:
ob.factorial();
break;
case 8:
ob.sumdigit();
break;
default:
System.out.println("PLZ TRY AGAIN.........\nYOU HAVE ENTERED A WRONG CHOICE.");
    }
    }
    while(ch>0);
    }
            }
