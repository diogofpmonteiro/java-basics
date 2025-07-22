public abstract class Shape {

    abstract double area();
    void display() { // CONCRETE instead of abstract
        System.out.println("This is a shape");
    }
}
