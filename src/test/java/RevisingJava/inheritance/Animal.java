package RevisingJava.inheritance;

public class Animal {
    private int age;

    public Animal(String animalName){
        System.out.println("working with animals"+animalName);
    }

    public Animal(int age) {
        this("kobra");
        this.age = age;
        System.out.println("this animal is "+age+" years old");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Note: Java allows only single inheritance
     * Inheritance Is a relationship: when we use extends keyword it inherits all the public and protected instance variables and methods of the parent(super) class
     * Class that extends another class is called child class
     */


}
