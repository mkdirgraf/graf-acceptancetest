package RevisingJava.polimorphism.polimorphicParameters;

public class Reptile {
    /**
     * Note: is the ability to pass instances of a subclass or interface to a method.
     * you can define a method that takes an instance of an interface as a parameter.
     * <p>
     * The most important pay close attention which object that reference is pointing to, and check if subclass have an overriden version of the superclass
     * method, because it doesn't matter which type of reference is pointing to the object, object doesn't change anyway
     */


    public String getName() {
        return "Reptile";
    }


}