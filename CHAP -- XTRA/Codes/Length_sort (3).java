import java.util.*;
class Length_sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array :");
        String arr[]=new String[5];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextLine();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j].length()>arr[j+1].length())
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The words after sorting are :");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}