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

📅 Date: 15/08/2026
✅ Day #13

📌 Topic: Class, Object, Properties, Methods

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

(Inheritance + Encapsulation + Polymorphism)

```java
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
```

📅 Date: 15/08/2026
✅ Day #14

📌 Topic: Access Modifiers + Non-Access Modifiers

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Access Modifiers)

```java
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
```

💻 Example #02

(static, final, abstract)

```java
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
```

📅 Date: 15/08/2026
✅ Day #15

📌 Topic: Encapsulation + Access Modifiers

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Encapsulation)

```java
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
```

💻 Example #02

(Encapsulation + Access Modifiers)

```java
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
```

📅 Date: 16/08/2026
✅ Day #16

📌 Topic: Encapsulation + Access Modifiers (Deep Practice)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Encapsulation with Getter & Setter)

```java
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
```

💻 Example #02

(Access Modifiers Practice)

```java
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
```

📅 Date: 16/08/2026
✅ Day #17

📌 Topic: Constructor (Default + Parameterized)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 16/08/2026
✅ Day #06

📌 Topic: Inheritance (Single + Multilevel)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 17/08/2026
✅ Day #18

📌 Topic: Polymorphism (Overloading + Overriding)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 17/08/2026
✅ Day #19

📌 Topic: Abstraction (Abstract Class + Interface)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 17/08/2026
✅ Day #20

📌 Topic: Inner Class

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 18/08/2026
✅ Day #21

📌 Topic: Collections (List, Set, Map)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 18/08/2026
✅ Day #22

📌 Topic: ArrayList vs LinkedList

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        System.out.println(list);
    }
}
```

💻 Example #02

```java
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
```

📅 Date: 18/08/2026
✅ Day #23

📌 Topic: Set (HashSet + TreeSet)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

```java
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
```

💻 Example #02

```java
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
```

📅 Date: 19/08/2026
✅ Day #24

📌 Topic: Map (TreeMap + Comparator)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(TreeMap — Sorted by Key)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Karim");
        map.put(1, "Ashik");
        map.put(2, "Rahim");

        System.out.println(map);
        System.out.println("First Key: " + map.firstKey());
    }
}
```

💻 Example #02

(Comparator to Sort Custom Objects)

```java
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karim", 22));
        students.add(new Student("Ashik", 20));

        students.sort((s1, s2) -> s1.age - s2.age);

        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}
```

📅 Date: 19/08/2026
✅ Day #25

📌 Topic: Iterator & Comparable Interface

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Iterator over a List)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
```

💻 Example #02

(Comparable Interface for Natural Ordering)

```java
class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student other) {
        return this.age - other.age;
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.List<Student> students = new java.util.ArrayList<>();
        students.add(new Student("Karim", 25));
        students.add(new Student("Ashik", 20));

        java.util.Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}
```

📅 Date: 19/08/2026
✅ Day #15

📌 Topic: Classes & Objects (Advanced Practice)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Multiple Objects + Object Array)

```java
class Book {
    String title;
    double price;

    void display() {
        System.out.println(title + " - $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];

        books[0] = new Book();
        books[0].title = "Java Basics";
        books[0].price = 15.5;

        books[1] = new Book();
        books[1].title = "DSA in Java";
        books[1].price = 22.0;

        for (Book b : books) {
            b.display();
        }
    }
}
```

💻 Example #02

(Object as Method Parameter)

```java
class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Calculator {
    double distance(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

public class Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        Calculator c = new Calculator();

        System.out.println("Distance: " + c.distance(a, b));
    }
}
```

📅 Date: 20/08/2026
✅ Day #16

📌 Topic: Constructors (Copy Constructor + Constructor Chaining)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Copy Constructor)

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ashik", 22);
        Student s2 = new Student(s1);

        s1.show();
        s2.show();
    }
}
```

💻 Example #02

(Constructor Chaining using this())

```java
class Box {
    int length, width, height;

    Box() {
        this(1, 1, 1);
        System.out.println("Default Box Created");
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    int volume() {
        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println("Volume: " + b1.volume());
    }
}
```

📅 Date: 20/08/2026
✅ Day #17

📌 Topic: Encapsulation (Real World Example)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Encapsulated Employee Class with Validation)

```java
class Employee {
    private String name;
    private double salary;

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Rahim");
        e1.setSalary(45000);

        System.out.println(e1.getName() + " earns " + e1.getSalary());
    }
}
```

💻 Example #02

(Immutable Class using Encapsulation)

```java
final class Account {
    private final String accountNumber;
    private final double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("AC1023", 5000);
        System.out.println(acc.getAccountNumber() + " -> " + acc.getBalance());
    }
}
```

📅 Date: 20/08/2026
✅ Day #18

📌 Topic: Inheritance (Hierarchical + super keyword)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Hierarchical Inheritance)

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}

class Bike extends Vehicle {
    void wheels() {
        System.out.println("Bike has 2 wheels");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        c.wheels();

        b.start();
        b.wheels();
    }
}
```

💻 Example #02

(Using super to access parent constructor & method)

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void greet() {
        System.out.println("Hello, I am " + name);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void greet() {
        super.greet();
        System.out.println("I teach " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Karim", "Mathematics");
        t.greet();
    }
}
```

📅 Date: 21/08/2026
✅ Day #19

📌 Topic: Polymorphism (Overloading + Dynamic Method Dispatch)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Runtime Polymorphism with Multiple Subclasses)

```java
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Square extends Shape {
    double side = 4;

    void area() {
        System.out.println("Square Area: " + (side * side));
    }
}

class Rectangle extends Shape {
    double length = 5, width = 3;

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Square();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
```

💻 Example #02

(Method Overloading with Different Parameter Types)

```java
class Printer {
    void print(int a) {
        System.out.println("Integer: " + a);
    }

    void print(String a) {
        System.out.println("String: " + a);
    }

    void print(double a) {
        System.out.println("Double: " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);
        p.print("Hello");
        p.print(3.14);
    }
}
```

📅 Date: 21/08/2026
✅ Day #20

📌 Topic: Abstraction (Abstract Class vs Interface)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Abstract Class with Partial Implementation)

```java
abstract class Payment {
    abstract void pay(double amount);

    void receipt() {
        System.out.println("Payment successful");
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " by card");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new CardPayment();
        p.pay(250);
        p.receipt();
    }
}
```

💻 Example #02

(Multiple Interface Implementation)

```java
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Printer implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.scan();
    }
}
```

📅 Date: 21/08/2026
✅ Day #21

📌 Topic: Practice Problems (OOP Recap)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Library System — Class Design Practice)

```java
class Book {
    String title;
    boolean isIssued;

    Book(String title) {
        this.title = title;
        this.isIssued = false;
    }

    void issue() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued");
        } else {
            System.out.println(title + " already issued");
        }
    }

    void returnBook() {
        isIssued = false;
        System.out.println(title + " returned");
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code");
        b1.issue();
        b1.issue();
        b1.returnBook();
    }
}
```

💻 Example #02

(Shape Hierarchy — Combining Inheritance + Abstraction)

```java
abstract class Shape {
    abstract double area();

    void show() {
        System.out.println("Area: " + area());
    }
}

class Triangle extends Shape {
    double base = 6, height = 4;

    double area() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Triangle();
        s.show();
    }
}
```

📅 Date: 22/08/2026
✅ Day #22

📌 Topic: Exception Handling (try-catch-finally + custom exceptions)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(try-catch-finally + multiple catch blocks)

```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error");
        } finally {
            System.out.println("Execution finished");
        }
    }
}
```

💻 Example #02

(Custom Exception)

```java
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    double balance = 500;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account();
        try {
            acc.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

📅 Date: 22/08/2026
✅ Day #23

📌 Topic: File Handling (Read/Write with FileWriter & BufferedReader)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Writing to a File)

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Day 23: Learning File Handling in Java");
            writer.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
```

💻 Example #02

(Reading from a File)

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```

📅 Date: 22/08/2026
✅ Day #24

📌 Topic: Collections Framework (Queue, Stack, Iterator)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Stack)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());
        stack.pop();
        System.out.println("After pop: " + stack);
    }
}
```

💻 Example #02

(Queue + Iterator)

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Removed: " + queue.poll());
    }
}
```

📅 Date: 23/08/2026
✅ Day #25

📌 Topic: String Handling (String, StringBuilder, StringBuffer)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Common String Methods)

```java
public class Main {
    public static void main(String[] args) {
        String s = "  Hello Java World  ";

        System.out.println(s.trim());
        System.out.println(s.trim().toUpperCase());
        System.out.println(s.trim().replace("Java", "Programming"));
        System.out.println(s.trim().split(" ").length + " words");
    }
}
```

💻 Example #02

(StringBuilder for Efficient Concatenation)

```java
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(" is ");
        sb.append("fun");
        sb.insert(0, "Learning ");

        System.out.println(sb.toString());
        System.out.println("Reversed: " + sb.reverse());
    }
}
```

📅 Date: 23/08/2026
✅ Day #26

📌 Topic: Basic Data Structures (2D Arrays + Linked List concept)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(2D Array — Matrix)

```java
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

💻 Example #02

(Simple Custom Linked List Node)

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
```

📅 Date: 23/08/2026
✅ Day #27

📌 Topic: Problem Solving (LeetCode-style Practice)

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Two Sum Problem)

```java
import java.util.*;

public class Main {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}
```

💻 Example #02

(Check Palindrome String)

```java
public class Main {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}
```

📅 Date: 24/08/2026
✅ Day #28

📌 Topic: Git & GitHub Basics

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Essential Git Commands)

```bash
git init
git status
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/username/repo.git
git push -u origin main
```

💻 Example #02

(Common Branching Workflow)

```bash
git checkout -b feature/login-page
git add .
git commit -m "Add login page"
git checkout main
git merge feature/login-page
git push origin main
```

📅 Date: 24/08/2026
✅ Day #29

📌 Topic: Final Project Development

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Project Skeleton — Student Management System)

```java
class Student {
    int id;
    String name;
    double gpa;

    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    void display() {
        System.out.println(id + " | " + name + " | GPA: " + gpa);
    }
}

class StudentManager {
    java.util.List<Student> students = new java.util.ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
    }

    void showAll() {
        for (Student s : students) {
            s.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student(1, "Ashikur", 3.85));
        manager.addStudent(new Student(2, "Rahim", 3.60));

        manager.showAll();
    }
}
```

💻 Example #02

(Adding Search Functionality to the Project)

```java
class StudentManager {
    java.util.List<Student> students = new java.util.ArrayList<>();

    Student findById(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.students.add(new Student(1, "Ashikur", 3.85));

        Student found = manager.findById(1);
        if (found != null) {
            found.display();
        } else {
            System.out.println("Student not found");
        }
    }
}
```

📅 Date: 24/08/2026
✅ Day #30

📌 Topic: Project Submission & Review

🔗 Source Code: https://github.com/Ashikur758/-IT24047___30-Days-Course-Plan

💻 Example #01

(Final Touches — Exception Handling in the Project)

```java
class StudentManager {
    java.util.List<Student> students = new java.util.ArrayList<>();

    void addStudent(Student s) throws IllegalArgumentException {
        if (s.gpa < 0 || s.gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0 and 4.0");
        }
        students.add(s);
    }
}

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        try {
            manager.addStudent(new Student(3, "Karim", 4.5));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

💻 Example #02

(Review Checklist Printed as Program Output)

```java
public class Main {
    public static void main(String[] args) {
        String[] checklist = {
            "Code compiles without errors",
            "All classes follow encapsulation",
            "Exception handling added",
            "README.md written",
            "Pushed to GitHub repository",
            "Project demo tested"
        };

        System.out.println("Final Project Review Checklist:");
        for (String item : checklist) {
            System.out.println("[ ] " + item);
        }
    }
}

