class akash
{
 public void main (int phy,int chem,int bio,int maths,int comp)
{
 int total= phy+chem+bio+maths+comp;
 float avg= total/5;
{ 
 if(avg >=90)
{ 
 System.out.println("THE TOTAL OF THE STUDENT IS "+total);
 System.out.println("THE AVERAGE OF THE STUDENT IS "+avg);
 System.out.println("THE GREAD OF THE STUDENT IS EXCELLEMT");
}
 else if(avg<= 90 && avg >= 70)
{
 System.out.println("THE TOTAL OF THE STUDENT IS "+total);
 System.out.println("THE AVERAGE OF THE STUDENT IS "+avg);
 System.out.println("THE GREAD OF THE STUDENT IS GOOD");
}
 else if(avg <= 70 && avg >=40)
 {
 System.out.println("THE TOTAL OF THE STUDENT IS "+total);
 System.out.println("THE AVERAGE OF THE STUDENT IS "+avg);
 System.out.println("THE GREAD OF THE STUDENT IS AVERAGE");
}
 else 
 System.out.println("THE TOTAL OF THE STUDENT IS "+total);
 System.out.println("THE AVERAGE OF THE STUDENT IS "+avg);
 System.out.println("SORRY HE IS FAILAED ");
}
    }
}
    
    