package p3;
import p1.Shape;
import java.util.Scanner;
public class Circle extends Shape {
    private double radius;
    public void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        radius = in.nextDouble();
    }
    public double area(){
        getData();
        return (3.14*radius*radius);
    }
}
