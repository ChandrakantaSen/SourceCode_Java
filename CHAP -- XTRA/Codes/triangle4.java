import java.io.*;
class triangle4
  {
      public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int i,j,n;
            System.out.println("enter the value of n=");
            n=Integer.parseInt(br.readLine());
            for(i=1;i<=n;i++)
               {
                   for(j=1;j<=n-i;j++)
                     {
                         System.out.print(" ");
                        }
                        for(j=1;j<=i;j++) 
                          {
                              System.out.print(j);
                            }
                            for(j=i-1;j>=1;j--)
                              {
                                  System.out.print(j);
                                }
                                System.out.println();
                            }
                            for(i=1;i<n;i++)
                              {
                                  for(j=1;j<=i;j++)
                                    {
                                        System.out.print(" ");
                                    }
                                    for(j=1;j<=n-i;j++)
                                      {
                                          System.out.print(j);
                                        }
                                        for(j=n-i-1;j>=1;j--)
                                          {
                                              System.out.print(j);
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                                    
                                  