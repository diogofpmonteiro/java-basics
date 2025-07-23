public class Car {
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // can't access car.model since it's private
    // so we use getters/setters
    String getModel(){
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if (price <= 0) {
            System.out.println("Price must be positive");
        } else {
            this.price = price;
        }
    }
}
