import java.io.*;
class Wholepattern
{
  public static void main(String args[])throws IOException
  { int cond=1;
      while (cond==1)
      {
          System.out.print("ENTER NUMBER WITHIN 1-15  FOR SELECTION OF PATTERNS");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int n=Integer.parseInt(br.readLine());
      switch(n)
      {
          
          
          
          
      case 1 :
      int i,j,k,l,s;
for(i=1;i<=3;i++)
{
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
System.out.print(' ');
}
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
for(j=2;j<=4;j++)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
System.out.print(' ');
    }
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
}
for(i=2;i>=1;i--)
{
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
   
    
System.out.print(' ');
    }
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
for(j=2;j<=4;j++)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
  for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
System.out.print(' ');
    }
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }    
}
break;







case 2 :
int m;
for(i=1;i<=3;i++)
{
for(j=4;j>=1;j--)
{
m=4-j+1;
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(k=1;k<=2*i-1;k++)
{
if(k%2==1)
{
for(l=1;l<=4-m;l++)
System.out.print(' ');
for(l=1;l<=2*m-1;l++)
System.out.print('*');
for(l=1;l<=4-m;l++)
System.out.print(' ');
    }
else
{
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
}
System.out.println();
    }
for(j=1;j<=4;j++)
{
m=4-j+1;
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(k=1;k<=2*i-1;k++)
{
if(k%2==1)
{
for(l=1;l<=4-m;l++)
System.out.print(' ');
for(l=1;l<=2*m-1;l++)
System.out.print('*');
for(l=1;l<=4-m;l++)
System.out.print(' ');
    }
else
{
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
}
System.out.println();
    }
}
for(i=2;i>=1;i--)
{
for(j=4;j>=1;j--)
{
m=4-j+1;
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(k=1;k<=2*i-1;k++)
{
if(k%2==1)
{
for(l=1;l<=4-m;l++)
System.out.print(' ');
for(l=1;l<=2*m-1;l++)
System.out.print('*');
for(l=1;l<=4-m;l++)
System.out.print(' ');
    }
else
{
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
}
System.out.println();
    }
for(j=1;j<=4;j++)
{
m=4-j+1;
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(k=1;k<=2*i-1;k++)
{
if(k%2==1)
{
for(l=1;l<=4-m;l++)
System.out.print(' ');
for(l=1;l<=2*m-1;l++)
System.out.print('*');
for(l=1;l<=4-m;l++)
System.out.print(' ');
    }
else
{
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
}
System.out.println();
    }
} 
break;




case 3 :
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
                        break;
                        
                        
                        
                        
  case 4:
    
        
        for (i=1;i<=n;i++)
           {
           for (s=1;s<=i-1;s++)
           {
             System.out.print(" ");
           }
           System.out.print("*");
           for (j=1;j<=(2*(n-i)+n);j++)
           {
           if(i==n)
           
           System.out.print("*");
           else 
           System.out.print(" ");
           }
           System.out.println("*");
           }
           for (i=n;i>=1;i--)
           {
           for (s=1;s<=i-1;s++)
           {
             System.out.print(" ");
           }
           System.out.print("*");
           for (j=1;j<=(2*(n-i)+n);j++)
           {
           if(i==n)
           
           System.out.print("*");
           else 
           System.out.print(" ");
           }
           System.out.println("*");
           }
           break;
           
           
           
           
           
           
           
 case 5:
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
                break;
                
                
                
 case 6:

                   for(i=1;i<=5;i++)
                      { 
                       for(j=1;j<=5;j++)
                       {
                         if(i==1||i==5)
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
                    break;
                    
                    
                    
                    
 case 7:
  k=0;
                   for (i=9;i>=1;i=i-2)
                      {
                          for(j=1;j<=k;j++)
                       System.out.print(" ");
                          for(j=i;j>=1;j--)
                          System.out.print("*");
                          k++;
                          System.out.println();
                        }
                        break;
                        
                        
 case 8:

for(i=1;i<=3;i++)
{
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
for(j=2;j<=4;j++)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
}
for(i=2;i>=1;i--)
{
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }         
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
System.out.print(' ');
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }    
}
break;




case 9:
 k=4;
                   for (i=1;i<=9;i=i+2)
                      {
                          for(j=1;j<=k;j++)
                       System.out.print(" ");
                          for(j=1;j<=i;j++)
                          System.out.print("*");
                          k--;
                          System.out.println();
                        }
                        break;
                        
                        
                        
 case 10 :
  for(i=1;i<=3;i++)
                      {
                          for(j=1;j<=i-1;j++)
                          System.out.print(' ');
                          System.out.println("*");
                        }
break;





case 11 :

                   for (i=3;i>=1;i--)
                       {
                              for(j=1;j<=3-i;j++)
                              System.out.print(' ');
                              for(j=1;j<=i;j++)
                              System.out.print("*");
                              System.out.println();
                            }
  break;
  
  
  
  case 12 :

        
        for (i=1;i<=n;i++)
           {
           for (s=1;s<=i-1;s++)
           {
             System.out.print(" ");
           }
           System.out.print("*");
          for (j=1;j<=(2*(n-i)+n);j++)
           
           if(i==n)
           
           System.out.print("*");
           else 
           System.out.print(" ");
           }
           System.out.println("*");
 break;
 
 
 
 
 case 13 :
int r=4;
      for (i=r;i>=1;i--)
         {
           System.out.print("*");
           for(j=1;j<=i-1;j++)
             System.out.print(" ");
            System.out.println("*");
              }
              break;
 case 14 :
  n=5;
n=Integer.parseInt(br.readLine());
for(i=n;i>=1;i--)
{
for(j=1;j<=n-i;j++)
System.out.print("      ");
for(j=1;j<=i;j++)
System.out.print("*     ");
System.out.println();
    }
    
    
    
 case 15 :
 

                   for(i=5;i<=1;i--)
                      {
                          k=5;
                          for(j=5;j>=1;j--)
                            {
                                System.out.print(k);
                                if(k>i)
                               k--;
                                
                            }
                            System.out.println();
                        }
        default :
    System.out.println("WRONG CHOICE");
}
        
        System.out.println("IF YOU WANT TO CONTINUE PRESS 1 ELSE PRESS 2");
        cond=Integer.parseInt(br.readLine());
    }
}
}
