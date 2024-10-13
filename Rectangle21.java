/**
 * Rectagle21
 */
public class Rectangle21 {

    public int length;
    public int width;

    public void displayInfo() {
        System.out.println("--------");
        System.out.println("Rectangle Length        : " + length);
        System.out.println("Rectangle Width         : " + width);
    }

    public int getArea() {
        return length * width;
    }

    public int getCircumference() {
        return 2 * (length + width);
    }
}