import java.io.*;
class digit_word
{
public static void main(String args[])throws IOException
{
int n,d=0,c=0,e,a=0;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter Any Number :"); 
n=Integer.parseInt(br.readLine());
if(n==0)
{
System.out.print("You just Typed Zero ...");
    }
    else if(n<0)
    {
        System.out.print("Minus ");
        n=n*(-1);
    }
        while(n>0)
{ 
d=d*10+n%10;  
n=n/10; 
c++; 
}

while(d>0)
{
  e=d%10;
  switch(c)
  {
   case 1:
       digit_word(e,a); 
       System.out.print("Only"); 
       break;
   case 2:
       if(e==1) 
       { 
           a=2; 
           break;
        }
	  digit_word(e,1);
	  break;
   case 3:
      digit_word(e,a); 
      System.out.print("Hundred ");  
      break;
   case 4:
      digit_word(e,a); 
      System.out.print("Thousand "); 
      break;
  }
d=d/10; 
c--;
if(d==1&&c==2)
{
System.out.print("Ten ");
    }
}
if(c!=0)
{
 System.out.print("Only");
}
}
   

static int digit_word(int x,int flag)
{
 if(flag==1)
 {
  switch(x)
   {
    case 2:
      System.out.print("Twenty ");
      break;
    case 3:
      System.out.print("Thirty "); 
      break;
    case 4:
      System.out.print("Fourty ");
      break;
    case 5:
      System.out.print("Fifty "); 
      break;
    case 6:
      System.out.print("Sixty "); 
      break;
    case 7:
      System.out.print("Seventy "); 
      break;
    case 8:
      System.out.print("Eightty "); 
      break;
    case 9:
      System.out.print("Ninety ");
      break;
  }
 return 0;
 }
 if(flag==2)
 {
  switch(x)
  {
    case 1:
      System.out.print("Eleven "); 
      break;
    case 2:
      System.out.print("Twelve ");
      break;
    case 3:
      System.out.print("Thirteen "); 
      break;
    case 4:
      System.out.print("Fourteen "); 
      break;
    case 5:
      System.out.print("Fiveteen ");
      break;
    case 6:
      System.out.print("Sixteen "); 
      break;
    case 7:
      System.out.print("Seventeen "); 
      break;
    case 8:
      System.out.print("Eighteen "); 
      break;
    case 9:
      System.out.print("Ninteen ");
      break;
  }
  return 0;
 }
 /*******************/
   switch(x)
   {
    case 0:
      System.out.print("zero "); 
      break;
    case 1:
      System.out.print("One ");
      break;
    case 2:
      System.out.print("Two "); 
      break;
    case 3:
      System.out.print("Three "); 
      break;
    case 4:
      System.out.print("Four ");
      break;
    case 5:
      System.out.print("Five "); 
      break;
    case 6:
      System.out.print("Six "); 
      break;
    case 7:
      System.out.print("Seven "); 
      break;
    case 8:
      System.out.print("Eight "); 
      break;
    case 9:
      System.out.print("Nine ");
      break;

   }/* end of switch */
         return 0;
 }   /* end of function */
}