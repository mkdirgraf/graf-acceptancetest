package RevisingJava.interfaces;

import com.sun.istack.Pool;

public class ImplementInterfaces implements Seal {

    @Override
    public int getNumberOfWhiskers() {
        return 10;
    }

    @Override
    public int getTailLenght() {
        return 10;
    }

    public String name;

    public ImplementInterfaces(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Seal seal = new ImplementInterfaces("Temirlan");
        System.out.println(seal.getNumberOfWhiskers()+10);
    }
}
