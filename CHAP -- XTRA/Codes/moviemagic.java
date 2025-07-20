import java.io.*;
class moviemagic
{
    int year;
    String title;
    float rating;
    moviemagic()
    {
    year=0;
    title="";
    rating=0.0f;
}
    void accept()throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
    System.out.println("Enter year, title and rating");
    year=Integer.parseInt(br.readLine());
    title= br.readLine();
    rating= Float.parseFloat(br.readLine());
}
void display()
{
    if((rating>=0.0)&&(rating<=2.0))
    {
        System.out.println("flop");
    }
    else if((rating>=2.1)&&(rating<=3.4))
    {
        System.out.println("semi hit");
    }
    else if((rating>=3.5)&&(rating<=4.5))
    {
        System.out.println("hit");
    }
    else
    {
        System.out.println("super hit");
    }
}

public static void main(String args[])throws IOException
{
moviemagic ob=new moviemagic();
ob.accept();
ob.display();
}
}

        
