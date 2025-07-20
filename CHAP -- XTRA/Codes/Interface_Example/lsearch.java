import java.io.*;

class lsearch
{
  int a[]=new int[100];
  int n,i,q,k,p;
  
  lsearch()
  {
    for(i=0;i<100;i++)
    {
      a[i]=0;
    }
    k=0;
  }
  
  lsearch(int x)
  {
    n = x;
  }
  
  void getdata()throws IOException
  {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the range: ");
    p = Integer.parseInt(in.readLine());
    System.out.println("Enter the array elements: ");
    for(i=0;i<n;i++)
    {
      a[i] = Integer.parseInt(in.readLine());
    }
    System.out.println("Enter the element to be searched: ");
    q = Integer.parseInt(in.readLine());
  }
  void check()
  {
    for(i=0;i<n;i++)
    {
      if(a[i] == q)
      {
        k=1;
        break;
      }
    }
  }
  
  void display()
  {
    if(k==1)
    {
      System.out.println("Element "+q+" is found at "+i);
    }
    else
    {
      System.out.println("Element "+q+" is not found at "+i);
    }
  }
  
  public static void main(String args[])throws IOException
  {
    lsearch obj = new lsearch();
    obj.getdata();
    obj.check();
    obj.display();
  }
}