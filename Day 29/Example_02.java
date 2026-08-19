import java.util.*;

class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ashik", 21));
        students.add(new Student("Rahim", 22));

        for (Student s : students) {

            s.display();

            System.out.println();
        }
    }
}