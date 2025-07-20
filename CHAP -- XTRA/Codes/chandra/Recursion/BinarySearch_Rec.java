import java.util.*;

class BinarySearch_Rec
{
    public static int rec_Binary(int sortedArray[], int start, int end, int key)
    {     
        int k=0;
        if (start < end)
        {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) 
            {
                return rec_Binary(sortedArray, start, mid-1, key);                 
            }
            else if (key > sortedArray[mid])
            {
                return rec_Binary(sortedArray, mid+1, end , key);     
            } 
            else 
            {
                k=1;
            }
        }
        if(k==1)
        {
            return (start + 1); 
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {     
        int arr1[] = new int[5];
        int i,ns,index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(i=0;i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the searching elements");
        ns = sc.nextInt();
        index = rec_Binary(arr1,0,arr1.length,ns);
        if(index>=0)
        {
            System.out.println(ns+" Found at "+index);
        }
        else
        {
            System.out.println(ns+" Not Found");
        }
    }
}