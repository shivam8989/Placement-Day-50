import java.util.ConcurrentModificationException;

public class Main {
    public static void main(String[] args) {
        SUV fortuner = new SUV("Fortuner",false);
        fortuner.move(40,0);
        fortuner.accelrate(20);
       // fortuner.accelrate(-60);
        System.out.println("Current Gear -> "+fortuner.getCurrentGear());
        System.out.println("Current Speed -> "+fortuner.getCurrentSpeed());

    }

    }