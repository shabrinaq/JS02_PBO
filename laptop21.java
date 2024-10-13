/**
 * laptop21
 */
public class laptop21 {
    String merk;
    String color;
    double ram, storage;

    public void turnOn() {
        System.out.println("Laptop now ON");
    }

    public void turnOff() {
        System.out.println("Laptop now OFF");
    }

    public double incrementRAM(double increment) {
        ram += increment;
        return ram;
    }

    public double decrementRAM(double decrement) {
        ram -= decrement;
        return ram;
    }

    public double incrementStorage(double increment) {
        storage += increment;
        return storage;
    }

    public double decrementStorage(double decrement) {
        storage -= decrement;
        return storage;
    }

    public void cetakInfo() {
        System.out.println("Merk    : " + merk);
        System.out.println("Color   : " + color);
        System.out.println("RAM     : " + ram);
        System.out.println("Storage : " + storage);
    }
}