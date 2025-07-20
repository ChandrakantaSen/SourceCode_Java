class D
     {
         public static void main()
               {
                   int i,j;
                   for(i=1;i<=10;i++)
                      { 
                       for(j=1;j<=5;j++)
                       {
                         if(i==1||i==10)
                            {
                                System.out.print("*");
                            }
                            else 
                            { 
                                if(j==1||j==5)
                                System.out.print("*");
                                else
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
            
                        