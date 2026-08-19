class Student {

    private String name;
    private int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Ashikur", 21);

        student.display();
    }
}