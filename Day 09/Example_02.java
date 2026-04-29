class Outer {
    static int x = 50;
    int y = 20;

    static class Inner {
        void show() {
            System.out.println("Static x: " + x);
        }
    }
}

public class Example_02 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}