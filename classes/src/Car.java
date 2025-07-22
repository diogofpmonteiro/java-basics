public class Car {
    String make = "Volkswagen";
    String model = "Polo";
    int year = 2014;
    double price = 6000.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Started the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("Stopped the engine");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }
}
