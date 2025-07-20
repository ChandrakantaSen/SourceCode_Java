public class ss
{
 public static void main(int no)
 {
     int i,sum=0,rem;
     while(no>0)
     {
     rem=no%10;
     no=no/10;
     sum=sum+rem;
    }   
     System.out.println(sum);
}
    }
    
