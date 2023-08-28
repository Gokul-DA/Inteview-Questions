package gokul.workingArea;

public class Dummy1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.display(); // Here, the method to be called is determined at compile time based on the static type (A), so "Class A" will be printed.
    }


}

class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}
