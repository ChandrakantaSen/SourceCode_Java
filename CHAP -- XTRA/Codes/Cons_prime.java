import java.io.*;
class Cons_prime
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int a,i,count=0;
 public void Cons_prime(int x)
   {
    a=x;   
    }
   
 void isprime()
   {
    for(i=1;i<=a;i++)
      {
       if(a%i==0)
         {
          count++;   
          }   
       }   
    }
 void show()
   {
    if(count==2)
      {
       System.out.println(a+" is a Prime number.");   
       }
    else
      {
       System.out.println(a+" is not a Prime number.");      
       }
    }
 public void main()throws IOException
   {
       System.out.println("Enter a number: ");
    int n=Integer.parseInt(br.readLine());   
Cons_prime ob=new Cons_prime();
ob.Cons_prime(n);
    ob.isprime();
    ob.show();
    }    
}
