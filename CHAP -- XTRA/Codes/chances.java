import java.util.*;
class chances
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("100 points for for location 1");
        System.out.println(" 50 points for for location 2");
        System.out.println(" 30 points for for location 3");
        System.out.println(" 20 points for for location 4");
        System.out.println(" 10 points for for location 5\n");
        int n=0,c=0,i,x=0,y=0;
        for(i=1;i<=2;i++)
        {
            System.out.println("Turn for player "+i+" :");
            n=0;c=0;
            while(n<=500)
            {
                int d= (int)(Math.random()*5+1);
                if(d==5)
                {
                    n+=10;c++;
                }
                else if(d==4)
                {
                    n+=20;c++;
                }
                else if(d==3)
                {
                    n+=30;c++;
                }
                else if(d==2)
                {
                    n+=50;c++;
                }
                else if(d==1)
                {
                    n+=100;c++;
                }
            }
            System.out.println("You have achieved 500 points in "+c+" attempts");            
            if(i==1)
            x=c;
            else
            y=c;
        }
        if(x>y)
        System.out.println("The winner is the 2nd player");
        else if(y>x)
        System.out.println("The winner is the 1st player");
        else
        System.out.println("Both of you are winner");
    }
}