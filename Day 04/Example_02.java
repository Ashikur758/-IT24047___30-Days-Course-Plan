class Person {
    private String name = "Private Name";
    public int age = 25;
    protected String city = "Dhaka";
    String country = "Bangladesh"; // default

    public void display() {
        System.out.println("Inside class:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(country);
    }
}

public class Example_02 {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println("Outside class:");

        // System.out.println(p1.name); 
        System.out.println(p1.age);     
        System.out.println(p1.city);     
        System.out.println(p1.country);  

        p1.display();
    }
}
