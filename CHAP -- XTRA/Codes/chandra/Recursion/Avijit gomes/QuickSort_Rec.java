//class to sort an array using recursive quick sort method 

import java.io.*;
public class QuickSort
{
    //instance variables
    int a[],n;
    //to call the recursive method sort() and print the sorted array   
    void callsort(int a1[])
    {
        a=a1;//initializing array a[]
        n=a.length;//finding size of a[]
        sort(0,n-1);//call to method sort()
        for(int x=0;x<n;x++)
            System.out.println(a[x]+"  ");
    }//endmethod
    //recursive method to sort the array using Quick sort method
    void sort(int lower, int upper)
    {
        if(upper>lower)
        {
            int i=split(lower,upper);//call to method split()
            sort(lower,i-1);//recursive calls
            sort(i+1,upper);
        }//endif
    }//endmethod
    // method to return the pivot
    int split(int lower,int upper)
    {
        int i,j,k,temp;
        i=lower;
        j=upper;
        k=a[lower];
        while(i<j)
        {
            while(a[j]>k )
            
                j--;
            while(a[i]<=k && i<upper)
                i++;
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }//endif
        }//endwhile
        a[lower]=a[j];
        a[j]=k;
        return j;
    }//end method
    //main() method to call other methods
    public static void main(String args[])throws IOException
    {
        //declaring local variables
        QuickSort obj=new QuickSort();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n, a1[];
        //taking inputs
        System.out.print("Enter the number of integers to be sorted:  ");
        n=Integer.parseInt(br.readLine());
        a1=new int[n];//allocating space for n integers
        System.out.println("\nEnter “+n+” integers");
        for(int x=0;x<n;x++)
        {
            a1[x]=Integer.parseInt(br.readLine());
        }//endfor
        //calling callsort() method
        obj.callsort(a1);
    }//endmain
}//endclass