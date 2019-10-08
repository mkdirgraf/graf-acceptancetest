package RevisingJava.inheritance;

public class Ape extends Primate {


    public Ape(){
        System.out.println("Ape");
    }

    private int numberOfFins=8;

    public Ape(int age){
        super(age);
        this.size=4;
    }

    public void displayPrimateDetails(){
        System.out.println("Primate with age: "+getAge());
        System.out.println("Primate size: "+this.size);
        System.out.println("Primate number of fins: "+numberOfFins);
    }

}
