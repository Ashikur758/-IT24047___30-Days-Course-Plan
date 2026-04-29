class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Example_01 {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Ashik");
        s1.setAge(21);

        // Getting values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}