package RevisingJava.inheritance.overriding;

public class HidingMehtodsInheritanceDemo {

    /**
     * Note: The method defined in the child class must be marked as "static" if it is marked as "static" in the parent class
     * (method hiding). Likewise, the mthod must not be marked as "static" in the child class if it is not marked as "static" in the parent class
     *
     *
     *
     *
     *
     */


    public static boolean eat(){
       return false;
    }

    public void getMuricipal(){
        System.out.println("Bear is eating: ");
    }

}
