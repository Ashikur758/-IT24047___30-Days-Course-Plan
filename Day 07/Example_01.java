class MathOperation {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 (Overloaded)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Example_01 {
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}