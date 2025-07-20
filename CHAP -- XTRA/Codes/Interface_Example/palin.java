import java.io.*;

class palin
{
  int n,sum=0;
  palin()
  {
    n=0;
  }
  
  void getdata()throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number: ");
    n = Integer.parseInt(in.readLine());
  }
  
  void calc()
  {
    int p=n;
    int d;
    
    while(p!=0)
    {
      d=p%10;
      sum = sum*10 +d;
      p=p/10;
    }
  }
  
  void display()
  {
    if(sum == n)
    {
      System.out.println("Palindrome Number");
    }
    else
    {
      System.out.println("Not Palindrome Number");
    }
  }
  
  public static void main(String args[])throws IOException
  {
    palin obj = new palin();
    obj.getdata();
    obj.calc();
    obj.display();
  }
}