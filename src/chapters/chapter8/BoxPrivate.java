package chapters.chapter8;

public class BoxPrivate {

    private double wight;
    private double height;
    private double depth;

    BoxPrivate(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    BoxPrivate() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    BoxPrivate(double len) {
        wight = height = depth = len;
    }

    BoxPrivate(BoxPrivate ob) {
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    double volume() {
        return wight * height * depth;
    }
}
