package RevisingJava.interfaces;

public  interface InterfaceDemos {

    /**
     * Note: interface is abstract data type that defines a list of abstract public methods that any class implementing the interface must provide
     * interface also can include a list of constant variables and default methods
     *
     * Note: A class may implement multiple interfaces, each separated by a comma, such as in the
     * following example:
     * public class Elephant implements WalksOnFourLegs, HasTrunk, Herbivore {
     * }
     *
     * if there are any number of abstract methods , concrete class is required to implement them
     *
     * Rules:
     * 1. Interfaces cannot be instantiated directly.
     * 2. An interface is not required to have any methods.
     * 3. An interface may not be marked as final.
     * 4. All top-level interfaces are assumed to have public or default access, and they must
     * include the abstract modifier in their definition. Therefore, marking an interface as
     * private, protected, or final will trigger a compiler error, since this is incompatible
     * with these assumptions.
     * 5. All nondefault methods in an interface are assumed to have the modifiers abstract
     * and public in their definition. Therefore, marking a method as private, protected,
     * or final will trigger compiler errors as these are incompatible with the abstract and
     * public keywords.
     *
     * Note: class can't extend an interface, it can implement it and can implement multiple interface simultaneously followed by coma
     *
     * Note: interface can not implement another interface, it can extend multiple interfaces followed by coma
     *
     * Note: if two interfaces have a same methods, with same methods name and signature, but different return types, then concrete class will give
     * a compilation error, if they have different method signature's but same method name, then it will just use it as method overloading,
     * concrete class can easily implement both of them
     *
     * All the interface variables have to be public static final, and should be initialized, all the final variables should be initialized
     */



}
