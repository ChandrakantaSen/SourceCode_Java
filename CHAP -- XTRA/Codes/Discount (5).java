import java.util.*;
class Discount{
    public static void main(String args[]){
        double total,discount=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        total=scan.nextDouble();
        if (total<=2000)
        {discount=(total*5/100);
        }
        else if(total>=2001&&total<=5000)
        {discount=(total*25/100);
        }
        else if(total>=5001&&total<=10000)
        {
            discount=(total*35/100);
        }
        else if(total>10000)
        {
            discount=(total*50/100);
        }
            System.out.println("The Total discount price is =" +discount);
            double nettotal=total-discount;
            System.out.println("Net total is = "+nettotal);
        }
    }

           