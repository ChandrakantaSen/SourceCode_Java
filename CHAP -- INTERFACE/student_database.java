class student {
     int rollNumber;
     void getNumber(int n){
          rollNumber=n;
     }
     void putNumber(){
          System.out.println("Roll No.:\t"+rollNumber);
     }
}
class test extends student {
     float part1,part2;
     void getMarks(float m1,float m2){
          part1=m1;
          part2=m2;
     }
     void putMarks(){
          System.out.println("part1:\t"+part1);
          System.out.println("part2:\t"+part2);
     }
}
interface sports{
     float sportwt=6.0F;
     void putWt();
}

class results extends test implements sports{
     float total;
     public void putWt(){
          System.out.println("sports weight:\t"+sportwt);
     }
     void display(){
          total=part1 + part2 + sportwt;
          putNumber();
          putMarks();
          putWt();
          System.out.println("total score:\t"+total);
     }
}

class student_database{
     public static void main(String args[]){
          results student1 = new results();
          student1.getNumber(1234);
          student1.getMarks(2705F,33.0F);
          student1.display();
     }
}
