class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Example_01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor called
        s1.display();
    }
}