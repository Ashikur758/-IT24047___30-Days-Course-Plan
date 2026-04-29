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

📅 Date: 23/04/2025
✅ Day #04

📌 Topic: Encapsulation + Access Modifiers (Deep Practice)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

🎥 Video: https://www.youtube.com/watch?v=HZUUYnIZO_0

💻 Example #01
(Encapsulation with Getter & Setter)

class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Ashik");
        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

💻 Example #02
(Access Modifiers Practice)

class Person {
    private String name = "Private Name";
    public int age = 25;
    protected String city = "Dhaka";
    String country = "Bangladesh";

    void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(country);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(p.age);
        System.out.println(p.city);
        System.out.println(p.country);

        p.show();
    }
}
📅 Date: 24/04/2025
✅ Day #05

📌 Topic: Constructor (Default + Parameterized)

💻 Example #01

class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
    }
}

💻 Example #02

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ashik", 21);
        Student s2 = new Student("Rahim", 22);

        s1.show();
        s2.show();
    }
}
📅 Date: 25/04/2025
✅ Day #06

📌 Topic: Inheritance (Single + Multilevel)

💻 Example #01

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

💻 Example #02

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {
    void cry() {
        System.out.println("Crying");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.cry();
    }
}
📅 Date: 26/04/2025
✅ Day #07

📌 Topic: Polymorphism (Overloading + Overriding)

💻 Example #01

class Math {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Math m = new Math();

        System.out.println(m.add(10, 20));
        System.out.println(m.add(10, 20, 30));
    }
}

💻 Example #02

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
📅 Date: 27/04/2025
✅ Day #08

📌 Topic: Abstraction (Abstract Class + Interface)

💻 Example #01

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}

💻 Example #02

interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
📅 Date: 28/04/2025
✅ Day #09

📌 Topic: Inner Class

💻 Example #01

class Outer {
    class Inner {
        void show() {
            System.out.println("Inner Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        i.show();
    }
}

💻 Example #02

class Outer {
    static class Inner {
        void show() {
            System.out.println("Static Inner Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.show();
    }
}
📅 Date: 29/04/2025
✅ Day #10

📌 Topic: Collections (List, Set, Map)

💻 Example #01

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}

💻 Example #02

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ashik");
        map.put(2, "Rahim");
        map.put(3, "Karim");

        System.out.println(map);
        System.out.println(map.get(2));
    }
}
📅 Date: 30/04/2025
✅ Day #11

📌 Topic: ArrayList vs LinkedList

💻 Example #01

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        System.out.println(list);
    }
}

💻 Example #02

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        list.addFirst("Start");
        System.out.println(list);
    }
}
📅 Date: 01/05/2025
✅ Day #12

📌 Topic: Set (HashSet + TreeSet)

💻 Example #01

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);
    }
}

💻 Example #02

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
