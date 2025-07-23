import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Animal animal;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("Invalid animal");
        }
 */
        Car car = new Car("Polo", "Black", 5000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
        car.setColor("Red");
        car.setPrice(0);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());



    }


}