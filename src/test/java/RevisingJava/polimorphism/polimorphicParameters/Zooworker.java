package RevisingJava.polimorphism.polimorphicParameters;

public class Zooworker {
    public static void feed(Reptile reptile){
        System.out.println(" feeding reptile "+reptile.getName());
    }

    public static void main(String[] args) {
        Zooworker.feed(new Crocodile());
        Zooworker.feed(new Oligator());
    }


}
