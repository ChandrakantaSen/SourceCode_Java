import java.util.*;

class Linear_Search
{
    void linSearch2(int[] arr, int fIndex, int lIndex, int searchNum)
    {
        if(fIndex == lIndex)
        {
            System.out.print("-1");
        }
        else
        {
            if(arr[fIndex] == searchNum)
            {
                System.out.print(fIndex);
            }
            else
            {
                linSearch2(arr, fIndex+1, lIndex, searchNum);
            }
        }
    }
    
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.print("Enter an array of numbers: ");

        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=input.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int search = input.nextInt();

 
        Linear_Search access = new Linear_Search();

        System.out.print("The position of the search item is at array index ");
        access.linSearch2(arr, 0, arr.length, search);
    }
} 
