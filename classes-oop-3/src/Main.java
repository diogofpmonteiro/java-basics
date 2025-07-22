
public class Main {
    public static void main(String[] args) {
        /*
        Circle circle = new Circle(9.2);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(5, 8);

        // Shape shape = new Shape(); -> Cannot be instantiated since it's abstract
        // abstracts logic that user doesn't need to/shouldn't access


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        */

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }
}