package gokul.workingArea.DP.Prototype;

public class Prototype {
    public static void main(String[] args) {
        Shape originalCircle = new Circle();
        Shape clonedCircle = originalCircle.clone();
        clonedCircle.draw(); // Output: Drawing a circle

        Shape originalSquare = (Shape) new Square();
        Shape clonedSquare = originalSquare.clone();
        clonedSquare.draw(); // Output: Drawing a square
    }
}






