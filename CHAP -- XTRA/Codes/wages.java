import java.io.*;
class wages extends Worker
{
    double hrs,rate,wage;
       public wages(String n,int b,double h,double r)
         {
                super(n,b);
                hrs=h;
                rate=r;
              
         }
        double overtime()
             {
               double ot=hrs*rate;
               return ot;
             }
        void display()
         {
             wage=overtime()+Basic;
super.display();
             System.out.println("WAGE="+wage);
         }
}
    
