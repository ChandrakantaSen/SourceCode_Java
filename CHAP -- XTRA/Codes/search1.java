import java.io.*;
class search1
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String name[]=new String[10];
      int roll[]=new int [10];
      int n,f=0,t=0;
      System.out.println("enter the name of ten students and their roll number");
      for(int i=0;i<10;i++)
      {
          name[i]=br.readLine();
          roll[i]=Integer.parseInt(br.readLine());
       }
       System.out.println("enter the searching roll number");
      n=Integer.parseInt(br.readLine()); 
       for(int i=0;i<10;i++)
       {
           if(n==roll[i])
           {
             f=1;
             t=i;
             
            }
        }
            if(f==1)
            {
                 System.out.println("search successfully");
                  System.out.println(""+name[t]);
                   System.out.println(""+roll[t]);
            }
            else
            {
                 System.out.println("search not found");
            }
        
    }
}