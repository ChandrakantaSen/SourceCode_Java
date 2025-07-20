import java.util.*;
class jrhhjsk
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,ch;
        System.out.println("press 1 for first series");
        System.out.println("press 2 for second series");
        ch=in.nextInt();
        switch(ch)
        {
            case 1:
          for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("0");
                else
                System.out.print("1");
           }
        System.out.println();
    }
    break;
    case 2:
    for(i=1;i<=4;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    break;
    default:
    System.out.println("wrong input");
}
}
}
    

        
