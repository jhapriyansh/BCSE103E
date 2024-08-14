// 14 Aug
abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("ZZZ");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("OINK!");
    }
}

public class OOPAbstraction {
    public static void main(String[] args) {
        Pig p1 = new Pig();
        p1.animalSound();
        p1.sleep();
    }
}
