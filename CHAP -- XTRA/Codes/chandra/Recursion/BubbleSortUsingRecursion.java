public class BubbleSortUsingRecursion {
 
    private static void bubbleSorted(int[] arg, int first, int last) 
    {
     
        if(first < last && last > 0)
        {
            if(arg[first] > arg[first+1]) 
            {
                int temp = arg[first];
                arg[first] = arg[first+1];
                arg[first+1] = temp;
            }
            bubbleSorted(arg, first+1, last);
            bubbleSorted(arg, first, last-1);
        }

 
    }
     
    public static void main(String[] args) {
        int arg[] = {23, 10, 66, 35, 87, 15};
         
        bubbleSorted(arg, 0, arg.length-1);
         
        for(int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] +" ");
        }
    }
}