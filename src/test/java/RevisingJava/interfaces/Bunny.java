package RevisingJava.interfaces;

public class Bunny implements StaticInterfaceMethodDemo {
    public void printDetails(){
        System.out.println(StaticInterfaceMethodDemo.getJump());
    }

    public static void main(String[] args) {
        Bunny bunny=new Bunny();
        bunny.printDetails();
    }
}
