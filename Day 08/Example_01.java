abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    // Implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Example_01 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        d1.eat();
    }
}