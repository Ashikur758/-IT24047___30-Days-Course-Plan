class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Example_02 {
    public static void main(String[] args) {
        Animal a;

        a = new Dog(); // Runtime polymorphism
        a.sound();
    }
}