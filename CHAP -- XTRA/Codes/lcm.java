import java.io.*;   
 class lcm
     {
         public static void main(String args[])throws IOException
         {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int m=0,n=0,div=n,dis=m,r=0,hcf=0,lcm=0,diff=0;
 
                  System.out.println("Enter two numbers:"); 
                   m=Integer.parseInt(br.readLine());
                   n=Integer.parseInt(br.readLine());
                   if(m>n)
                   {
                     div=m;
                     dis=n;
                    }
                    
                      while(div%dis!=0)
                        
                           {
                           r=div%dis;
                           div=dis;
                           dis=r;
                        }
                       hcf=dis;
                       lcm=m*n/hcf;
                   System.out.println("lcm="+lcm);
                   System.out.println("hcf="+hcf);
                  /* if(hcf>lcm)
                   {
                       diff=hcf-lcm;
                       System.out.println("difference is="+diff);
                    }
                    else
                    {
                        diff=lcm-hcf;
                        System.out.println("difference is="+diff);
                    }*/
                }
                }
                
                        