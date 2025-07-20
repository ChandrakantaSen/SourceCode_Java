import java.util.*;
class Bubble_sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[20];
        int i,j;
        System.out.println("Enter the 20 names :");
        for(i=0;i<20;i++)
        name[i]=sc.next();
        String temp;
        for(i=0;i<19;i++)
        {
            for(j=0;j<19-i;j++)
            {
                if(name[j].length()>name[j+1].length())
                {
                    temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                }
                else if((name[j].compareTo(name[j+1])>0)&&(name[j].length()==name[j+1].length())  )
                {
                    temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
                }
            }
        }
        System.out.println("The names after sorting are :");
        for(i=0;i<20;i++)
        System.out.println(name[i]);
    }
}