package RevisingJava.inheritance;

public class Lion extends Animal {
    /**
     * Note: you can have at most only one public class, and the file name will be public class's name.java
     * public--->can be accessed from anywhere
     * protected--->can be accessed from the same package and by subclasses
     * default no access modifier--> can be accessed only within the same package classes
     * private----->only within the class
     * Note: Class can be final, if the class is set final, then that class is immutable, you can't change anything , and it can't be extended
     * Note: Object class is the only class that doesn't have a parent(super)class
     * Note: By default every class extends Object class, even if you extend another existing class it will still extend Object class by default
     * Note: super() like this() can be only the first statement of the Constructor
     */
public Lion(){
    super(5);
}


    public void roar(){
        System.out.println("The "+getAge()+" years old lion says ROAR");
    }

    public static void main(String[] args) {
        Lion baby=new Lion();
        baby.setAge(12);
        baby.roar();
    }


}
