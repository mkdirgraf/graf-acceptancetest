package RevisingJava.inheritance;

import java.io.PipedReader;

public class Primate extends Object {
protected int size;
private int age;

public Primate(int age){
    this.age=age;
}

public int getAge(){
    return age;
}

    public Primate(){
        super();
        System.out.println("Primate");
    }

/**
 * ================super vs super()==============
 * super()-->explicitly calls a prent class constructor and may only be used in the first line of a constructor of a child class
 * super----> is a keyword used to reference a member defined in a parent class and may be used throughout the child class.
 */


}
