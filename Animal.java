// dynamic method dispatch example in Java

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class Main {
    public static void main(String[] args) {

        // Create an array of Animal references
        Animal[] farm = new Animal[3];

        // Store different animal objects
        farm[0] = new Dog();
        farm[1] = new Cat();
        farm[2] = new Cow();

        // Call makeSound() using a loop
        for (int i = 0; i < farm.length; i++) {
            farm[i].makeSound();
        }
    }
}
