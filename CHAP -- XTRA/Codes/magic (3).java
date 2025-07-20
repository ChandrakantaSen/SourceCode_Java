class magic
     {
       public static void main(int n)
             {
               int s=0,c=n; 
               while(n>0)
                    {
                      s=s+(n%10);
                      n=n/10;
                    }
                    if(s==10)
                    System.out.print(c+" is a magic number");
                    else
                    System.out.print(c+" is not a magic number");
                }
            }
            
     