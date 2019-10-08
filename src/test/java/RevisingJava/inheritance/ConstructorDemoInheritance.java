package RevisingJava.inheritance;

public class ConstructorDemoInheritance {
    /**
     * Note: first statmetn of every constructor is either a call to another constructor within the class, using this(),
     * or a call to a constructor in the direct parent class, using super()
     * When you extend your Parent(super) class, you should check first constructors of the parent class, if the parent class have a constructor except
     * No argument constructor, then subclass should create at least one constructor that calls explicitly calls a parent constructor via the super() command.
     *==================Constructor Rules=========================
     *1.The first statement of every constructor is a call to another constructor within the class
     * using this(), or a call to a constructor in the direct parent class using super().
     * 2. The super() call may not be used after the first statement of the constructor.
     * Introducing Class Inheritance 243
     * 3. If no super() call is declared in a constructor, Java will insert a no-argument super()
     * as the first statement of the constructor.
     * 4. If the parent doesn’t have a no-argument constructor and the child doesn’t define any
     * constructors, the compiler will throw an error and try to insert a default no-argument
     * constructor into the child class.
     * 5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
     * call to a parent constructor in each child constructor.
     * Make sure you understand these rules; the exam will often provide code that breaks one
     * or many of these rules and therefore doesn’t compile.
     *
     *
     * Note: Parent Constructor is always executed before Child constructor
     */

    public static void main(String[] args) {



    }
}
