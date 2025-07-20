class Grade
{
  public static void main(int maths, int phy, int chem, int bio)
  {
      int total=maths+phy+chem+bio;
      {
          
          System.out.print("\nYour total is ="+total); 
          
      if(total>=80)
      {
          System.out.print("\nYour grade is A");
        }
        else if ((total>=60) && (total<80))
        {
            System.out.print("\nYour grade is B");
        }
        else if ((total>=45)&&(total<=59))
        {
            System.out.print("\nYour grade is C");
        }
        else
        {
            System.out.print("\nYour grade is D");
        }
    }
}
               } 