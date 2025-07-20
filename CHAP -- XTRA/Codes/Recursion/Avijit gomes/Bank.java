class bank
 {
     protected String nam;
     protected long accno;
     bank()
      {
          nam="";
          accno=0;
        }
     bank(long x,String na)
      {
          nam=na;
          accno=x;
        }
    }
class deposite extends bank
 {
     private double amt;
     deposite(long x,String na,double q)
      {
          super(x,na);
          amt=q;
        }
     void showdetails()
      {
          System.out.println("Name="+nam);
          System.out.println("Account Number="+accno);
          System.out.println("Fixed deposite amount="+amt);
        }
    }
public class result
 {
     public static void main(String args[])
      {
          deposite bnk=new deposite(1223,"Mr.XYZ",750000);
          System.out.println("Account details-");
          bnk.showdetails();
        }
    }