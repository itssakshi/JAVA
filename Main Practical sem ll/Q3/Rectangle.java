package P2;
import P1.Shape;
import java.util.Scanner;
public class Rectangle extends Shape {
    private double length;
    private double breadth;
    public void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        length = in.nextDouble();
        breadth = in.nextDouble();
    }
    public double area(){
        getData();
        return length*breadth;
    }
}