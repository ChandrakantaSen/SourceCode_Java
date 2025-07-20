class dubnium
     {
       public static void main(int n)
             {
                 int i,j,k,l;
                 for(i=1;i<=n;i++)
                    { 
                      for(j=1;j<=4;j++)
                         {
                             for(k=1;k<=n;k++)
                                {
                                    for(l=1;l<=4-j;l++)
                                       {
                                           if((i>1)&&(j==1)&&(k>=2)&&(l==1))
                                             System.out.print('*');
                                             else
                                             System.out.print(' ');
                                            }
                                            for(l=1;l<=2*j-1;l++)
                                            {
                                                if((j==4)&&(k==n)&&(l>2*j-n))
                                                  continue;
                                                  System.out.print('*');
                                                }
                                                for(l=1;l<=3-j;l++)
                                                System.out.print(' ');
                                            }
                                            System.out.println();
                                        }
                         for(j=3;j>=1;j--)
                         {
                             if((i<n)&&(j==1))
                             continue;
                             for(k=1;k<=n;k++)
                                {
                                    for(l=1;l<=4-j;l++)
                                       System.out.print(' ');
                                       for(l=1;l<=2*j-1;l++)
                                       System.out.print('*');
                                       for(l=1;l<=3-j;l++)
                                       System.out.print(' ');
                                    }
                                    System.out.println();
                                }
                            }
                        }
                    }
                    
                                    
                                    
                                    
                                    
                                    
                                    
                                                