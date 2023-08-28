package gokul.workingArea.DP.Prototype;

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public Shape clone() {
        Shape clone;
        try {
            clone = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
