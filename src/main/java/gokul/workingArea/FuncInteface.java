package gokul.workingArea;

@FunctionalInterface
public interface FuncInteface<T,R> {
    void apply(T t,R r);
}
