import java.util.*;
class serie

{
public static void main(String args[])
{
  int n,c=0,r,n1;
  Scanner in=new Scanner(System.in);
  System.out.println("enter the number");
  n=in.nextInt();
  while(n>0)
  {
      r=(n%10);
      n=(n/10);
      c=c+r;
    }
    System.out.println("the sum of the digit is"+c);
}
}
