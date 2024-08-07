// 7 Aug
class Main {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can.");
    }

    public void speed(int speed) {
        System.out.printf("Max speed of the car is: %d km/hr\n", speed);
    }
}

public class MethWithObj {
    public static void main(String[] args) {
        Main o1 = new Main();
        o1.fullThrottle();
        o1.speed(300);
    }
}
