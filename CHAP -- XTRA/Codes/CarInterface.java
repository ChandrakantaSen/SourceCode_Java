interface CarInterface
{
    public static final String NO_COLOUR="";
    public static final String RED_COLOUR="red";
    public static final String BLUE_COLOUR="blue";
   abstract public void honk();
    public void go(int newVelocity );
    public void brake();
}
    