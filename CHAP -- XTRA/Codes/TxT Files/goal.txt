class goal
     {
         public static void main()
                {
                    int i,j;
                    for(i=1;i<=3;i++)
                       {
                           for(j=1;j<=3-i;j++)
                           System.out.print(' ');
                           for(j=1;j<=2*i-1;j++)
                           {
                           if((j==1)||(j==(2*i-1)))
                           System.out.print('*');
                           else
                           System.out.print(' ');
                           if((j==1)&&(i==3))
                           continue;
                           else
                           System.out.print(' ');
                        }
                    System.out.println();
                }
                }
            }
            
                
                        