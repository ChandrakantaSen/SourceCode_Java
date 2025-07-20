class uhfkln
{
    public static void main(String args[])
    {
        int i,s,j,a=1;
        for(i=6;i>=1;i--)
        {
          for(s= 1;s<a;s++)
          {
          System.out.print(" ");
        }
        for(j=a;j<=6;j++)
            {
                if(j%2==0)
                System.out.print("0");
                else
                System.out.print("1");
            }
              a=a+1;
           System.out.println();
        }
    }
}
            
        
            
