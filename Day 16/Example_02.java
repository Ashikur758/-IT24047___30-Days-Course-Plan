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