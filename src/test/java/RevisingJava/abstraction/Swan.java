package RevisingJava.abstraction;

public class Swan extends Animal {

    @Override
    public String getName(){
        return "Tima";
    }

    public static void main(String[] args) {
       Swan swan=new Swan();
        System.out.println(swan.getName());
    }
}
