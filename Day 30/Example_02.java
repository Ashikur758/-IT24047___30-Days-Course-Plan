class Animal {

    private String name;

    Animal(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    void sound() {

        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    Dog(String name) {

        super(name);
    }

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal animal = new Dog("Tommy");

        System.out.println("Name: " + animal.getName());

        animal.sound();
    }
}