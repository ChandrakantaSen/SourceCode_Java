class Cross
     {
         public static void main()
               {
                   int i,j;
                   for(i=3;i>=1;i--)
                      {
                          for(j=1;j<=3-i;j++)
                          System.out.print(' ');
                          for(j=1;j<=2*i-1;j++)
                          if((j==1)||(j==2*i-1))
                          System.out.print("*");
                          else
                          System.out.print(" ");
                          System.out.println();
                        }
                    
                for(i=2;i<=3;i++)
                      {
                          for(j=1;j<=3-i;j++)
                          System.out.print(' ');
                          for(j=1;j<=2*i-1;j++)
                          if((j==1)||(j==2*i-1))
                          System.out.print("*");
                          else
                          System.out.print(" ");
                          System.out.println();
                        }
                    }
                }
                