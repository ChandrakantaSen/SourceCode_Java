package Puspendu;

class tollbooth
{
    private static int ncars,amount;
    tollbooth()
    {
        ncars=0;
        amount=0;
    }
    void goodcars()
    {
        ncars=ncars+1;
        amount +=5;
    }
    void badcars()
    {
        ncars=ncars+1;
    }
    void display()
    {
        System.out.println("Number of cars passed : "+ncars);
        System.out.println("Total amount collected : "+amount);
    }
}