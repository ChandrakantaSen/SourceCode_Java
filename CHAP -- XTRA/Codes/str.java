class str
{
    public static void main()
    {
        String str="Hello World";
        char arr[];
        
        arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
                System.out.println(arr[i]);
        }
    }
}