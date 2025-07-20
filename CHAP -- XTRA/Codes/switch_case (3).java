import java.util.*;

class switch_case
{
    public static void main(String args[]) 
    {
        int n;
        
        System.out.println("1. Good Morning");
        System.out.println("2. Good Afternoon");
        System.out.println("3. Good Night");
        System.out.println("4. Good Night");
        Scanner in = new Scanner(System.in);
        System.out.print("enter ur choice: ");
        n = in.nextInt();
       
        switch(n)
        {
            case 1:    
                        System.out.println("Good Morning");     
                        break;
            case 2:
                        System.out.println("Good Afternoon");  
                        break;
            case 3:
            case 4:
                        System.out.println("Good Night"); 
                        break;
            default:
                        System.out.println("out of range...");
        }
    }
}