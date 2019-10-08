package RevisingJava.inheritance.overriding;

import javax.naming.InsufficientResourcesException;

public class Camel {

    protected  boolean hasLegs() throws InsufficientResourcesException{
        throw new InsufficientResourcesException();
    }

protected double getWeight() throws Exception{
        return 2;
}

}
