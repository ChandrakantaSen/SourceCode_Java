import java.io.*;
class useorder
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Welcome customer. Please enter the number of copies you want to order ! ");
        int copies=Integer.parseInt(br.readLine()); // input of number of copies ordered
       
        order ob=new order();
        order ob2=new order(3089, 9874, 3, 395);  //automatic call to parameterised constructor
       
        ob.fillarray(); //function call
        ob.disparr();   //function call
        ob.new_order(1009, 11, copies, 395); //parameterised function call
        ob.disp_details(); //function call
        ob.calc_bill();    //function call
       
        int numcopies=ob.return_copies(); //function call
        int pr=ob.return_price();         //function call
        int amount=ob.return_bill();      //function call
        System.out.println("The amount of bill to be paid for "+numcopies+ " copies at the price of "+pr+" per copy is equal to "+amount);
    }
}
       
       
  

class order
{
    int bookid, custid, numcopies, price, bill;
    int array[]=new int[5];
   
    order()
    {
        bookid=0;
        custid=0;
        numcopies=0;
        price=0;
        bill=0;
    }
   
    order(int b, int c, int cop, int p)
    {
        bookid=b;
        custid=c;
        numcopies=cop;
        price=p;
        bill=numcopies*price;
    }
   
   
    void fillarray()
    {
        array[0]=2;
        array[1]=3;
        array[2]=5;
        array[3]=7;
        array[4]=11;
      
    }
    void disparr()
    {
        int i;
        System.out.println("The first five prime numbers as elements of the array  are : ");
       
        for(i=0;i<5;i++)
        {
            System.out.println(array[i]);
        }
    }

    void new_order(int bi, int ci, int n, int p)
    {
        bookid=bi;
        custid=ci;
        numcopies=n;
        price=p;
    }
    void disp_details()
    {
        System.out.println("YOUR BOOKING ID IS = "+bookid);
        System.out.println("YOUR CUSTOMER ID IS = "+custid);
        System.out.println("The number of copies as per your order are = "+numcopies);
        System.out.println("The price per copy is = "+price);
    }
    void calc_bill()
    {
        bill=numcopies*price;
    }
    int return_bill()
    {
        return bill;
    }
    int return_copies()
    {
        return numcopies;
    }
    int return_price()
    {
        return price;
    }
}