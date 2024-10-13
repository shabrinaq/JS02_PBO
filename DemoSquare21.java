/**
 * DemoSquare21
 */
public class DemoSquare21 {

    public static void main(String[] args) {
        Rectangle21 square1 = new Rectangle21();
        Rectangle21 square2 = new Rectangle21();

        square1.length = 20;
        square1.width = 20;

        square2.length = 15;
        square2.width = 23;

        System.out.println("--------");
        System.out.println("Square 1");
        square1.displayInfo();
        System.out.println("Square Area             : " + square1.getArea());
        System.out.println("Square Circumference    : " + square1.getCircumference());

        System.out.println(" ");
        System.out.println("--------");
        System.out.println("Square 2");
        square2.displayInfo();
        System.out.println("Square Area             : " + square2.getArea());
        System.out.println("Square Circumference    : " + square2.getCircumference());
    }
}