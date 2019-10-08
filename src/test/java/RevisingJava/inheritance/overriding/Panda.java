package RevisingJava.inheritance.overriding;

public class Panda extends Murcipal {
    /**
     * you can't override a static method of parent class
     * hidden methods
     * only replace parent methods in the calls defined in the child class
     */


    public static boolean eat() {
        return true;
    }

    public void getPandaDescription() {
        System.out.println("Panda hops on two legs: " + eat());
    }

    public static void main(String[] args) {
//        Panda panda = new Panda();
//        panda.getPandaDescription();
        Murcipal murcipal = new Murcipal();
        murcipal.getMarsupialDescription();

    }
}

