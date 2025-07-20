class pat
  {
    public static void main(String args[])
      {
        
        int i,j,s;

        
        for (i=1;i<=5;i++)
           {
           for (s=1;s<=i-1;s++)
           {
             System.out.print(" ");
           }
           System.out.print("*");
           for (j=1;j<=(2*(5-i)+5);j++)
           {
           if(i==5)
           
           System.out.print("*");
           else 
           System.out.print(" ");
           }
           System.out.println("*");
           }
           for (i=5;i>=1;i--)
           {
           for (s=1;s<=i-1;s++)
           {
             System.out.print(" ");
           }
           System.out.print("*");
           for (j=1;j<=(2*(5-i)+5);j++)
           {
           if(i==5)
           
           System.out.print("*");
           else 
           System.out.print(" ");
           }
           System.out.println("*");
           }
           }
           }
           
           
