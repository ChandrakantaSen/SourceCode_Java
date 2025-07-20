class nnff
     {
         public static void main()
               {
                   int a,b,c,i,con;
                      for(i=4;i<=25;i++)
                         {
                             a=1;
                             con=0;
                             b=0;
                             c=a+b;
                             while(c<=i)
                                {
                                  c=a+b;
                                  a=b;
                                  b=c;
                                  if(c==i)
                                    {
                                        con=1;
                                        break;
                                    }
                                }
                                if(con==0)
                                  System.out.println(i);
                                }
                            }
                        }
                        