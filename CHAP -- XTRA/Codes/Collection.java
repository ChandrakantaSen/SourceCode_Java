import java.util.*;
class Collection
{
    int arr[],len;
    Collection()
    {
        len=0;
    }
    Collection(int x)
    {
        len=x;
        arr=new int[x];
    }
    void inparr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<len;i++)
        arr[i]=sc.nextInt();
    }
    void arrange()
    {
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void display()
    {
        System.out.println("The elements of the array are as follows :");
        for(int i=0;i<len;i++)
        System.out.println(arr[i]);
    }
    Collection common(Collection ob)
    {
        int i,j,count;
        i=0;j=0;count=0;
        while((i<arr.length)&&(j<ob.arr.length))
        {
            if(arr[i]!=ob.arr[j])
            {
                if(arr[i]<ob.arr[j])
                {while((arr[i]<ob.arr[j])&&(i<arr.length))
                i++;}
                else
                {while((arr[i]>ob.arr[j])&&(j<ob.arr.length))
                j++;}
            }
            else
            count++;
        }
        Collection obj=new Collection(count);
        i=0;j=0;count=0;
        while((i<arr.length)&&(j<ob.arr.length))
        {
            if(arr[i]!=ob.arr[j])
            {
                if(arr[i]<ob.arr[j])
                {while((arr[i]<ob.arr[j])&&(i<arr.length))
                i++;}
                else
                {while((arr[i]>ob.arr[j])&&(j<arr.length))
                j++;}
            }
            else
            obj.arr[count++]=arr[i];
        }
        return obj;
    }
    static void main()
    {
        Collection ob1=new Collection(5);
        Collection ob2=new Collection(5);
        ob1.inparr();ob1.arrange();ob1.display();
        ob2.inparr();ob2.arrange();ob2.display();
        Collection ob3=ob1.common(ob2);
        ob3.display();
    }
}