package RevisingJava.polimorphism;

public class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStriped(){
        return false;
    }

    public int age=10;

    @Override
    public void getAge(){
        System.out.println("this is the overriden version");
    }

    public static void main(String[] args) {
        Lemur lemur=new Lemur();
        System.out.println(lemur.age);
        lemur.getAge();
        Primate primate=lemur;
        primate.hasHair();
        HasTail hasTail=lemur;
        ((Lemur) hasTail).hasHair();
    }


}
