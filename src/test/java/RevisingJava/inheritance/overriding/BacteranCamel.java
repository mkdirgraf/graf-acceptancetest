package RevisingJava.inheritance.overriding;

import javax.naming.InsufficientResourcesException;

public class BacteranCamel extends Camel {

    @Override
    protected boolean hasLegs(){
        return false;
    }

    public double getWeight() throws InsufficientResourcesException{
        return 2;
    }

}
