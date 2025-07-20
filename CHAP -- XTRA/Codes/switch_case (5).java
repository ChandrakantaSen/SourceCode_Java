import java.io.*;
 class switch_case
 {
     public static void main(String args[])throws IOException
     {
        int ch;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the choice: ");
        ch = Integer.parseInt(in.readLine());
        
        switch(ch)
        {
            case 1: 
                       
            case 2:
                       int e,f,g;
                       System.out.println("enter 1st number: ");
                       e = Integer.parseInt(in.readLine());
                       System.out.println("enter 2nd number: ");
                       f = Integer.parseInt(in.readLine());
                       g=(e-f);
                       System.out.println("difference is: "+g);
                       break;
            default:
                        System.out.println("wrong input");
        }
     }
 }