class Ammecable
     {
         public static void main(int i,int j)
               {
                   int c,b,d=0,s=0,a;
                   for( a=1;a<=2;a++)
                      {
                          if(a==1)
                          {
                              c=i;
                              d=j;
                            }
                          else
                          {
                              c=j;
                          d=i;
                        }
                        s=c;
                          for(b=1;b<=c/2;b++)
                          {
                             s=s+b;
                            } 
                             if(s!=d)
                             break;
                            }
                            if((a>2)&&(s==d))
                            System.out.print("ammecable");
                            else if(a>2)
                          System.out.print("not ammecable");
                        }
                    }
                    