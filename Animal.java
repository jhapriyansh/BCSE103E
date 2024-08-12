//  12 Aug
//  Needs inherit animal to work;
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Oink!");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Woof!");
    }
}