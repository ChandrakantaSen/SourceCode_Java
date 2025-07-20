import java.util.*;
class   Linear_search
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
        int i,loc = 0;
        String str;
        String m[]=new String[10];
        boolean p = false;
        for(i=0;i<10;i++)
        {
            System.out.println("enter the name in cell"+(i+1)+":");
            m[i]=in.nextLine();
        }
         System.out.println ("enter the name to be searched ");
         str=in.nextLine();
         for(i=0;i<10;i++)
         {
             if(m[i].equals(str))
             {
                 loc=i+1;
                 p=true;
                }
            }
            if(p==true)
            {
                System.out.println(str+"is found at location"+loc);
            }
            else
            {
                System.out.println(str+"is not found ");
            }
        }
    }
    