import java.io.*;
class search2
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String name[]=new String[10];
      int roll[]=new int [10];
      int n,l,m=0,i;
      String t="";
      System.out.println("enter the name");
      for(i=0;i<10;i++)
      {
          name[i]=br.readLine();
          }
       for(i=0;i<10;i++)
      {
          l=name[i].length();
          if(l>m)
          {
              m=l;
              t=name[i];
            }
        }
        System.out.print("maximum length"+m);
        System.out.println(""+t);
    }
}
       