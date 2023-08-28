package gokul.workingArea;


public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
//        Consumer<String> funcInteface = (a) -> System.out.println();
//        FuncInteface<String, Integer> funcInteface = (a, b) -> System.out.println(a + b);
//        funcInteface.apply("GOkul", 1);
//        System.out.println();
    }

    private static int factorial(int i) {
        return i == 1 ? i : i * factorial(i - 1);
    }
}
