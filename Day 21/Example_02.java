class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
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

        Student s = new Student("Ashikur", 21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}