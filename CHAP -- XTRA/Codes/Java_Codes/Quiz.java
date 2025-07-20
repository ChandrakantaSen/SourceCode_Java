import java.util.*;

class Quiz
{
    public static void main(String args[])
    {
        int e=0,k=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("WELCOME TO QUIZ CHALLENGE 2014-15");
        System.out.println("PRESS 1 FOR RULE 2 FOR PLAYING GAME");
        int c=sc.nextInt();
        switch(c)
        
        {
            case 1: System.out.println("ITS A VERY SIMPLE GAME ; EACH QUESTION CONTAINS 20 POINTS ; EACH POINT HAS 5 RS IF WRONG ANSWER U HAVE TO GIVE 5RS.\n LETS PLAY!!!!!");
            
            case 2:System.out.println(" QUESTION 1:-\nWHAT IS THE PRODUCT OF ALL WHOLE NUMBERS?");
            System.out.println("YOUR OPTIONS ARE :-\n(1)0.\n(2)9594994.\n(3)32.\n(4)100.");
            int d=sc.nextInt();
            if(d==1)
            {
                System.out.println("WELL DONE !!! CORRECT ANSWER U WON 20 POINTS");
                e=e+20;
            }
             else
            {
            System.out.println("SORRY  WRONG ANSWER!!");
                k=k+20;
            }
           
            System.out.println(" QUESTION 2:-\nWHAT IS THE PRODUCT OF ALL CONSICUTIVE PRIME NUMBER?");
            System.out.println("YOUR OPTIONS ARE :-\n(1)0.\n(2)6.\n(3)956464648464848.\n(4)100.");
            int f=sc.nextInt();
            if(f==2)
            {
                System.out.println("WELL DONE !!! CORRECT ANSWER U WON 20 MORE POINTS");
                e=e+20;
            }
             else
            {
            System.out.println("SORRY  WRONG ANSWER!!");
                k=k+20;
            }
           
             System.out.println(" QUESTION 3:-\n  WHICH ACID IS PRESENT IN HUMAN BODY");
            System.out.println("YOUR OPTIONS ARE :-\n(1)NITRIC ACID.\n(2)HYDROCHORIC  ACID.\n(3)SULPHURIC ACID.\n(4)LEMON ACID.");
            int g=sc.nextInt();
            if(g==2)
            {
                System.out.println("WELL DONE !!! CORRECT ANSWER U WON 20 MORE POINTS");
                e=e+20;
            }
             else
            {
            System.out.println("SORRY  WRONG ANSWER!!");
                k=k+20;
            }
           
            System.out.println(" QUESTION 4:-\n  WHICH IS THE STRONGEST PART OF OUR HUMAN BODY?");
            System.out.println("YOUR OPTIONS ARE :-\n(1)BONE.\n(2)MUSCLES.\n(3)SKULL.\n(4)TEETH.");
            int h=sc.nextInt();
            if(h==4)
            {
                System.out.println("WELL DONE !!! CORRECT ANSWER U WON 20 MORE POINTS");
                e=e+20;
            }
             else
            {
            System.out.println("SORRY  WRONG ANSWER!!");
                k=k+20;
            }
           

         System.out.println(" QUESTION 5:-\n  WHICH IS THE STRONGEST NATURAL OCURRING SUBSTANCE?");
            System.out.println("YOUR OPTIONS ARE :-\n(1)DIAMOND.\n(2)IRON.\n(3)GOLD.\n(4)COPPER.");
            int i=sc.nextInt();
            if(i==1)
            {
                System.out.println("WELL DONE !!! CORRECT ANSWER U WON 20 MORE POINTS");
                e=e+20;
            }
            else
            {
            System.out.println("SORRY  WRONG ANSWER!!");
                k=k+20;
            }
            int F=5*e;
            if(F>0)
            System.out.println(" YOUR FINAL SCORE ="+e+"POINTS\nYOU WON rs="+F);
            else
            System.out.println(" YOUR FINAL SCORE ="+e+"POINTS\nYOU lost rs="+k);
            System.out.println(" \n\nTHANK YOU FOR PLAYING!!");
        }
    }
}


    

