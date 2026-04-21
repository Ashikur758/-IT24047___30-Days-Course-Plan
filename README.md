# -IT24047___30-Days-Course-Plan
This repository contains a 30-day structured Java learning roadmap designed for beginners. It covers core programming concepts, problem-solving techniques, and practical development skills using Java.  The course is organized day-by-day, making it easy to follow and build consistency.

📅 30-Day Learning Plan

🔹 Week 1: Java Basics

Day 1: Introduction to Java & Setup (JDK, IDE)

Day 2: Basic Syntax & Structure

Day 3: Variables & Data Types

Day 4: Operators

Day 5: Input/Output (Scanner)

Day 6: Conditional Statements (if-else, switch)

Day 7: Practice Problems

🔹 Week 2: Control Flow & Functions

Day 8: Loops (for, while, do-while)

Day 9: Nested Loops

Day 10: Methods (Functions)

Day 11: Method Overloading

Day 12: Arrays (1D)

Day 13: Arrays (2D)

Day 14: Practice + Mini Project

🔹 Week 3: OOP Concepts

Day 15: Classes & Objects

Day 16: Constructors

Day 17: Encapsulation

Day 18: Inheritance

Day 19: Polymorphism

Day 20: Abstraction

Day 21: Practice Problems

🔹 Week 4: Advanced Topics & Project

Day 22: Exception Handling

Day 23: File Handling

Day 24: Collections Framework

Day 25: String Handling

Day 26: Basic Data Structures

Day 27: Problem Solving (LeetCode-style)

Day 28: Git & GitHub Basics

Day 29: Final Project Development

Day 30: Project Submission & Review



📘 IT24047 – 30 Days Java Course Plan

👨‍💻 Name: Ashikur Rahman Ashik

📅 Date: 20/04/2025
✅ Day #01

📌 Topic:
Class, Object, Properties, Methods, Inheritance + Encapsulation + Polymorphism

🔗 Source Code:
https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

🎥 Video:
https://www.youtube.com/watch?v=s2hoJkIz3RQ

💻 Example #01

(Class, Object, Properties, Methods)

class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ashikur";
        s1.age = 20;
        s1.displayInfo();
    }
}
💻 Example #02

(Inheritance + Encapsulation + Polymorphism)

class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Tommy");

        System.out.println("Dog Name: " + d1.getName());
        d1.sound();
    }
}
📅 Date: 21/04/2025
✅ Day #02

📌 Topic:
Access Modifiers + Non-Access Modifiers

🔗 Source Code:
https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

🎥 Video:
https://www.youtube.com/watch?v=lWFzm8qIR1c

💻 Example #01

(Access Modifiers)

class Student {
    public String name;
    private int age;
    protected String school;
    String city;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
        System.out.println("City: " + city);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Ashikur";
        s1.setAge(20);
        s1.school = "XYZ School";
        s1.city = "Dhaka";

        s1.display();
    }
}
💻 Example #02

(static, final, abstract)

abstract class Shape {
    abstract void draw();

    static void info() {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape {
    final double PI = 3.1416;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing Circle");
        double area = PI * radius * radius;
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape.info();

        Circle c1 = new Circle(5);
        c1.draw();
    }
}
📅 Date: 22/04/2025
✅ Day #03

📌 Topic:
Encapsulation + Access Modifiers

🔗 Source Code:
https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

🎥 Video:
https://www.youtube.com/watch?v=HZUUYnIZO_0

💻 Example #01

(Encapsulation)

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);

        System.out.println("Balance: " + acc.getBalance());
    }
}
💻 Example #02

(Encapsulation + Access Modifiers)

class Student {
    private String name;
    private int age;

    public String university;
    protected String city;
    String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University: " + university);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ashikur");
        s1.setAge(23);

        s1.university = "MBSTU";
        s1.city = "Tangail";
        s1.country = "Bangladesh";

        s1.display();
    }
}
