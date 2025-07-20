import java.io.*;

class AreaPerimeter
{
    public static void main(String args[]) throws IOException
    {
        int length, breadth;
        double area, perimeter;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        
        System.out.println("Enter the length: ");
        length = Integer.parseInt(br.readLine());
        System.out.println("Enter the breadth: ");
        breadth = Integer.parseInt(br.readLine());
        
        area = (length * breadth);
        perimeter = (2*(length + breadth));
        
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}