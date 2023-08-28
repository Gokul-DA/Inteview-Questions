package gokul.August.aug3;

public abstract class Student implements Cloneable {
    public int id;
    public Student(int id) {
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
