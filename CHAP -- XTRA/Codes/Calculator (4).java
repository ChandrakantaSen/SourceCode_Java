/* calculator project
   
  menu driven options from 1 to 6
  options are add, sub,mul,div & conversions--bin to dec, dec to bin */ 

import java.io.*;
public class Calculator // class calculator
{
  int x,y;                    // instance variables
  String s,s1;
  public void choice()throws IOException          
  {
     boolean ans=true;       // boolean variable initialized  
     while(ans==true)
     {
        //System.out.println("\f"); // to clear the screen
        System.out.println("                                   CALCULATOR     ");
        System.out.println("\t_________________________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t 1    ADDITION ");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t 2    SUBTRACTION");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t 3    MULTIPLICATION");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t 4    DIVISION");
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t 5    DECIMAL TO BINARY");
        System.out.println();
        System.out.println();     
        System.out.println("\t\t\t 6    BINARY TO DECIMAL ");
        System.out.println();
        System.out.print("\t\t ENTER  your choice ...");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String s=br.readLine();
        int n=Integer.parseInt(s); // get the choice as a number
    
        switch(n)
        {
        case 1:                   // choice to add two numbers
          BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));   
          System.out.print("Enter first number  :");
          s=br1.readLine();
          x=Integer.parseInt(s);
          System.out.print("Enter second number :");
          s1=br1.readLine();
          y=Integer.parseInt(s1);
          System.out.println("The results is "+(x+y));
          break;
          
        case 2:                  // choice to subtract two numbers
          BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));   
          System.out.print("Enter first number  :");
          s=br2.readLine();
          x=Integer.parseInt(s);
          System.out.print("Enter second number :");
          s1=br2.readLine();
          y=Integer.parseInt(s1);
          System.out.println("The results is "+(x-y));
          break;
          
        case 3:                 // choice to multiply two numbers
          BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));   
          System.out.print("Enter first number  :");
          s=br3.readLine();
          x=Integer.parseInt(s);
          System.out.print("Enter second number :");
          s1=br3.readLine();
          y=Integer.parseInt(s1);
          System.out.println("The results is "+(x*y));
          break;
          
        case 4:                 // choice to divide
          BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));   
          System.out.print("Enter first number  :");
          s=br4.readLine();
          x=Integer.parseInt(s);
          System.out.print("Enter second number :");
          s1=br4.readLine();
          y=Integer.parseInt(s1);
          System.out.println("The results is "+((float)x/y));
          break;
          
        case 5:                 // convert decimal to binary
          BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));  
          System.out.print("Enter a decimal number  :");
          s=br5.readLine();
          x=Integer.parseInt(s);
          int a[]=new int[25];
          int c=0;
          while(x>0)
          {
            int p=x%2;
             if (p==0)
             {
                a[c]=0;
                c=c+1;
             }
             else
             {
                a[c]=1;
                c=c+1;
             }
             x=x/2;
          }
          System.out.print("The result is ");
          for(int i=c;i>=0;i--)
          {
              System.out.print(a[i]);
          }
          System.out.println();
          break;
            
        case 6 :                      // convert binary to decimal
          int x1=0;
          BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));   
          System.out.print("Enter a binary number  :");
          s=br6.readLine();
          int l;
          int z;
          double d1,d;
          String p="";
          double num=0;
          l=s.length();
          for(int i=l-1;i>=0;i--)
          {
             char a1=s.charAt(i);
             p=p+a1;
             d=Integer.parseInt(p);
             d1=Math.pow(2,x1);
             d=d*d1;
             num=num+d;
             x1++;
             p="";
          }
          z=(int)num;
          System.out.println("The result is "+z);
       } // end of switch case
     
       System.out.print(" Press y to continue else press n for exit  ");
       BufferedReader B_input = new BufferedReader(new InputStreamReader(System.in));
       String S_input= B_input.readLine();
       ans=(S_input.charAt(0)=='y'||S_input.charAt(0)=='Y')?true:false;

     } //end of the while loop
     System.out.println("\f Good Bye"); //exit from the project

   }// end of method

}// end of class

