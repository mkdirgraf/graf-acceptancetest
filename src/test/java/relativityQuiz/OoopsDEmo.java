package relativityQuiz;

import java.util.ArrayList;
import java.util.List;

interface Tima {
    public abstract void draw();
}

class Circle implements Tima {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}

class Line implements Tima {
    @Override
    public void draw() {
        System.out.println("line");
    }

}

public class OoopsDEmo {
    public static List<Tima> tima;

    public static void drawing(List<Tima> list) {
        for (Tima obj : list) {
            obj.draw();
        }
    }

//    public void drawAll() {
//        for (Tima tima : this.tima) {
//            tima.draw();
//        }
//    }

    public static void main(String[] args) {
        tima = new ArrayList<>();
        Tima circle = new Circle();
        Tima line = new Line();
        tima.add(circle);
        tima.add(line);
        drawing(tima);

    }


}
