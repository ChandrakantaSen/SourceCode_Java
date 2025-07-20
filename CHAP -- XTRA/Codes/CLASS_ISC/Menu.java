import java.util.*; //Importing Utilization package
class Menu //Declaring class
{
    int ch; //Declaring global variables
    Menu(int c) //Parametrized constructor
    {
        ch=c;
    }
    void merge(int A[],int B[]) //Program to merge two arrays
    {
        int C[]=new int[A.length+B.length]; //Creating third array
        int i=0,j=0,k=0; //Declaring local variables
        while((i<A.length)&&(j<B.length)) //Merging the two arrays
        {
            if(A[i]<B[j])
            C[k++]=A[i++];
            else
            C[k++]=B[j++];
        }
        for(;i<A.length;)
        C[k++]=A[i++];
        for(;j<B.length;)
        C[k++]=B[j++];
        System.out.println("The elements of merged array are as follows :-"); //Displaying the merged array  
        for(k=0;k<C.length;k++)
        System.out.println(C[k]);
    }
    void fibo(int a,int b,int n) //Recurrsive method to print fibonacci series
    {
        if(n==0)
        return;
        else
        {
            int c=a+b;
            System.out.println(c);
            fibo(b,c,n-1);
        }
    }
    void linear_search(String st[],String search)
    {
        boolean flag1=false,flag2=false;
        int pos1=0,pos2=0;
        for(int i=0;i<st.length;i++)
        {
            if(st[i].equals(search))
            {flag1=true;pos1=i;}
            else if(st[i].equalsIgnoreCase(search))
            {flag2=true;pos2=i;}
        }
        if(flag1)
        System.out.println("Search successful, found at position "+(pos1+1));
        else if(flag2)
        System.out.println("Search successful on ignoring case , found at position "+(pos2+1));
        else
        System.out.println("Search failed, not found");
    }
    void choice() //Method to check user input
    {
        Scanner sc=new Scanner(System.in);
        switch(ch) //Switch case to check choice of user
        {
            case 1:
            int i;
            System.out.println("Input size of first array :-");
            int n1=sc.nextInt();
            int A[]=new int[n1];
            System.out.println("Input elements of first array in ascending order :-");
            for(i=0;i<n1;i++)
            A[i]=sc.nextInt();
            System.out.println("Input size of second array :-");
            int n2=sc.nextInt();
            int B[]=new int[n2];
            System.out.println("Input elements of second array in ascending order :-");
            for(i=0;i<n2;i++)
            B[i]=sc.nextInt();
            merge(A,B);
            break;
            case 2:
            System.out.println("Input the no. of terms :-");
            int n=sc.nextInt();
            if(n>=1)
            System.out.println("0");
            if(n>=2)
            System.out.println("1");
            if(n>2)
            fibo(0,1,n-2);
            break;
            case 3:
            int j;
            System.out.println("Input size of array :-");
            int s=sc.nextInt();
            String st[]=new String[s];
            System.out.println("Input elements of array :-");
            for(j=0;j<s;j++)
            st[j]=sc.next();
            System.out.println("Input String to be searched :-");
            String str=sc.next();
            linear_search(st,str);
            break;
            default:
            System.out.println("Wrong Choice !!");
        }
    }
    public static void main() //Main method
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu : \n1.To merge two arrays in ascending order \n2.To print fibonacci series \n3.To search for a input string in an array \nInput your choice :");
        int ch=sc.nextInt(); //Taking input
        Menu ob=new Menu(ch);
        ob.choice();
    }
}