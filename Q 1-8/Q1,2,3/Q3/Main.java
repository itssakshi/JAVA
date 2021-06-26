import P1.Shape;
import P2.Rectangle;
import P3.Circle;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1 for rectangle shape and 2 for circle shape.\nEnter your choice");
    int choice = in.nextInt();
    Shape ob;
    boolean flag = false;
    while (!flag) {
      switch (choice) {
      case 1:
        flag = true;
        ob = new Rectangle();
        System.out.println("Area: " + ob.area() + " sq unit.");
        break;
      case 2:
        flag = true;
        ob = new Circle();
        System.out.println("Area: " + ob.area() + " sq unit.");
        break;
      default:
        System.out.println("Invalid Input");
        break;
      }
    }
  }
}