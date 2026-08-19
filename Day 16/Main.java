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