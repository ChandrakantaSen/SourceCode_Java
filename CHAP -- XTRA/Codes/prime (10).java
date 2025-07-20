class prime
{ 
void pp(int a)
    { 
        System.out.println("This program prints whether the");
      System.out.println("number input is a prime or not");
      int c=0;
      for(int i=1;i<=a;i++)
      { 
          if (a % i == 0) 
          { 
              c++;
          }
        }
      if (c==2)
      { 
          System.out.println(a+" is a prime number.");
        }
    else
    {
        System.out.println(a+" is not a prime number ");
    }
    }
}    