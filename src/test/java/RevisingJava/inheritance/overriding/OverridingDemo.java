package RevisingJava.inheritance.overriding;

import RevisingJava.inheritance.Caniene;

public class OverridingDemo extends Caniene {

    /**
     *Why do we need to Override the method of the Parent class?
     * Because you may want to define a new version of an existing method in child class that makes use of the definition in the parent class
     *================Overriding rules=============
     *1. The method in the child class must have the same signature as the method in the parent
     * class.
     * 2. The method in the child class must be at least as accessible or more accessible than the
     * method in the parent class.
     * 3. The method in the child class may not throw a checked exception that is new or
     * broader than the class of any exception thrown in the parent class method.
     * 4. If the method returns a value, it must be the same or a subclass of the method in the
     * parent class, known as covariant return types.(ex: if parent class has a return type of void, and you are declaring int in sub class, it will
     * throw an compilation error, and Covariant type works only for non-primitive data types
     *
     *=====Method overloading vs method overriding========
     * Both should have a same method name
     * Method overloading requires to have different method signature while method overriding requires same signature as in parent class version
     *
     *Note: Rule 3------------> a child method may hide or eliminate a parent methods exception without issue
     *
     *
     * Note: It is not possible to override a private method of the super class, since it is not accessible to child class,
     * Child class can have its own version of that method, and this method in child class in separate and independent method, unrelated to parent version's method
     *and it is not an override version of the parent class method, because private method in parent class is hidden and inaccessible
     */

    @Override
    public double getAverageWeight(){
        return super.getAverageWeight()+20.0;
    }
    public static void main(String[] args){

        System.out.println(new Caniene().getAverageWeight());
        System.out.println(new OverridingDemo().getAverageWeight());
    }


    /**
     *
     *
     */


}
