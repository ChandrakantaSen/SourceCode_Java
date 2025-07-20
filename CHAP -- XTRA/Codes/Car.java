public class Car implements CarInterface
{

    String colour;
    int velocity;
    public Car( String initColour)
    {
        if((initColour.equals(RED_COLOUR))||(initColour.equals(BLUE_COLOUR)))
        colour=initColour;
        else
        colour=NO_COLOUR;
    }
    public void honk()
    {
        System.out.println("Beep,beep!!");
    }
    public void go(int newVelocity )
    {
        velocity=newVelocity;
    }
    public void brake()
    {
        velocity=0;
    }
}