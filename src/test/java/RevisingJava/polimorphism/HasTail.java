package RevisingJava.polimorphism;

public interface HasTail {

    public abstract boolean isTailStriped();

    public default void getAge(){
        System.out.println("This is default method coming from the interface");
    }
}
