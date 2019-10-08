package RevisingJava.abstraction;

public abstract class Animal {

    /**
     * Note: they have to be marked as abstract class, abstract class provides reusable methods and variables, and subclasses should provide an implementation for those abstract methods
     * Note: abstract methods don't have a body, they are marked as abstract, subclass that extends abstract class should provide an implementation
     * for that abstract method
     * Abstract class can not be instantiated
     * Note: Abstract class may include both abstract and non abstract methods, all the abstract methods should be implemented by the child class
     * Note: abstract class can't be marked as final, because abstract class should be extended
     *Note: abstract methods also can't be marked as final and private, otherwise the method can never be overriden in a subclass, making it impossible to create
     * a concrete instance of the abstract class
     *Note: first non abstract subclass that extends abstract class is called Concrete class, concrete class is required to implement all inherited abstract methods
     *
     * Note: abstract class can extend another abstract class, and it is not required to implement abstract methods of the parent abstract class
     *
     *
     */

    protected int age;
    public void eat(){
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}
