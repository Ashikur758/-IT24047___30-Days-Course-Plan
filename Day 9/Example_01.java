class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class Example_01 {
    public static void main(String[] args) {
        Outer obj1 = new Outer(); // Outer class object
        Outer.Inner obj2 = obj1.new Inner(); // Inner class object

        obj2.display();
    }
}