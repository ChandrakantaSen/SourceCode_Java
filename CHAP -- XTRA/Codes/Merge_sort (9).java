import java.util.*;
class Merge_sort
{
    String arr[];
    int size;
    Merge_sort()
    {
        size=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        size=sc.nextInt();
        arr=new String[size];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        arr[i]=sc.next();
    }
    void arrange()
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    String[] merge(Merge_sort A)
    {
        String C[]=new String[size+A.size];
        int i,j,k;
        i=0;
        j=0;
        k=0;
        while((i<size)&&(j<A.size))
        {
            if(arr[i].compareTo(A.arr[j])>0)
            C[k++]=A.arr[j++];
            else
            C[k++]=arr[i++];
        }
        for(;i<size;)
        C[k++]=arr[i++];
        for(;j<A.size;)
        C[k++]=A.arr[j++];
        return C;
    }
    void display()
    {
        for(int i=0;i<size;i++)
        System.out.println(arr[i]);
    }
    static void main()
    {
        Merge_sort A=new Merge_sort();
        Merge_sort B=new Merge_sort();
        A.input();
        B.input();
        A.arrange();
        B.arrange();
        Merge_sort C=new Merge_sort();
        C.arr=A.merge(B);
        C.size=C.arr.length;
        System.out.println("First Array :");
        A.display();
        System.out.println("Second Array :");
        B.display();
        System.out.println("Merged Array :");
        C.display();
    }
}