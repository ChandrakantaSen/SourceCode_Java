import java.io.*;
class Cons_Armstrong
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int a,b,c,p=0,q=0,i,count=0;
 public void Cons_prime(int x)
   {
    a=x;   
    }
 void user()throws IOException
   {
    System.out.println("Enter a number: ");
    a=Integer.parseInt(br.readLine());   
    }
 void isarmstrong()
   {
    b=a;   
    while(b>0)
      {
       p=b%10;
       q+=(p*p*p);
       b=b/10;
       }
    c=q;   
    }
 void show()
   {
     if(c==a)
       {
        System.out.println(a+" is an Armstrong number.");   
        }
     else
       {
        System.out.println(a+" is not an Armstrong number.");    
        }    
    }
 public static void main()throws IOException
   {
    Cons_Armstrong ob=new Cons_Armstrong();
    ob.user();
    ob.isarmstrong();
    ob.show();
    }   
}
