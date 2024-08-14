interface Animal {
    public void animalSound();

    public void sleep();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("OINK!");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }
}

public class interFaces {
    public static void main(String[] args) {
        Pig p1 = new Pig();
        p1.animalSound();
        p1.sleep();
    }
}
