// 12 Aug
// Needs animal.java to work
public class InheritAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal pig = new Pig();
        animal.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}
