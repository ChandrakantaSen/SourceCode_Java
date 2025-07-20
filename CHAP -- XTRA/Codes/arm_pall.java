import java.io.*;
class arm_pall
{
    static int armstrong (int n)
    {
        int flag=0;
        int m=n,p=0;
        double s=0.00;
        while(m>0)
        {
            p=m%10;
            s=(int)s+(Math.pow(p,3));
            m=m/10;
        }
        if(n==s)
        flag=1;
        else flag=0;
        return flag;
    }
    
    static int pallindrome(int a)
    {
        int k=a,g=0,c=0,flag=0;
        while(k>0)
        {
            g=k%10;
            c=c*10+g;
            k=k/10;
        }
        if(c==a)
        flag=1;
        else flag=0;
        return flag;
    }
    
    public static void main(String args[])throws IOException
    {
        String ans;
        do
        {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int ss,op;
        System.out.println("Enter a number:");
        ss=Integer.parseInt(br.readLine());
        System.out.println("                     ");
        System.out.println("1.pallindrome");
        System.out.println("2.armstrong");
        System.out.println("            ");
        System.out.println("Enter your choice:");
        op=Integer.parseInt(br.readLine());
        arm_pall ob=new arm_pall();
        switch(op)
          {
              case 1:
              int ff;
              ff=ob.pallindrome(ss);
              if(ff==1)
                System.out.println(ss+ " "+ "is a pallindrome no.");
              else
                System.out.println(ss+ " "+ "is not a pallindrome no.");
               break;
               
               case 2:
              int hf;
              hf=ob.armstrong(ss);
              if(hf==1)
                System.out.println(ss+ " "+ "is an armstrong  no.");
              else
                System.out.println(ss+ " "+ "is not an armstrong no.");
               break;
               
               default:
                System.out.println( "invalid choice.");
            }
            
            System.out.println("Do you want to continue? enter  yes or no");
            ans=(br.readLine());
        }while(ans.equals("yes"));
        System.out.println("Thank you.");
        }
    }
               
               
              