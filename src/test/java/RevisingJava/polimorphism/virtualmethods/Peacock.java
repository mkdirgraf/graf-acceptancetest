package RevisingJava.polimorphism.virtualmethods;

public class Peacock extends Bird {

    @Override
    public String getName(){
        return "peacock";
    }

    public static void main(String[] args) {
        Bird bird=new Peacock();
        bird.displayInformation();

    }
}
