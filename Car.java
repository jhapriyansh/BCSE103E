// 12 Aug

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car o1 = new Car();
        o1.honk();
        System.out.printf("%s %s\n", o1.brand, o1.modelName);
    }
}
