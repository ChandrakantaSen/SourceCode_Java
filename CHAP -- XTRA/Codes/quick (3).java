import java.io.*;
class quick
{
    int elements[]=new int[100];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void main()throws IOException
    {
        int i,maxsize;
        System.out.println("How many elements you want to sort ");
        maxsize=Integer.parseInt(br.readLine());
        int elements[]=new int[maxsize];
        System.out.println("\nEnter the values one by one ");
        for(i=0;i<maxsize;i++)
        {
            System.out.println("Enter element : "+i);
            elements[i]=Integer.parseInt(br.readLine());
        }
        quicksort(elements,maxsize);
        System.out.println("\nArray after sorting : \n");
        for(i=0;i<maxsize;i++)
        System.out.println(elements[i]);
    }
    void quicksort(int elements[],int maxsize)
    {
        sort(elements,0,maxsize-1);
    }
    void sort(int elements[],int left,int right)
    {
        int pivot,l,r;
        l=left;
        r=right;
        pivot=elements[left];
        while(left<right)
        {
            while((elements[right]>=pivot)&&(left<right))
            right--;
            if(left!=right)
            {
                elements[left]=elements[right];
                left++;
            }
            while((elements[left]<=pivot)&&(left<right))
            left++;
            if(left!=right)
            {
                elements[right]=elements[left];
                right--;
            }
        }
        elements[left]=pivot;
        pivot=left;
        left=l;
        right=r;
        if(left<pivot)
        sort(elements,left,pivot-1);
        if(right>pivot)
        sort(elements,pivot+1,right);
    }
}