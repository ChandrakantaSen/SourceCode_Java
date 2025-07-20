class Slab_Program
{
    public static void main(int marks)
    {
        char grade;
        if(marks<=100 && marks>=90)
        {
            grade = 'A';
        }
        else if(marks<90 && marks>=70)
        {
            grade = 'B';
        }
        else if(marks<70 && marks>=50)
        {
            grade = 'C';
        }
        else if(marks<50 && marks>=30)
        {
            grade = 'D';
        }
        else
        {
            grade = 'E';
        }
        System.out.println("Marks is: "+marks);
        System.out.println("Grades is: "+grade);
    }
}