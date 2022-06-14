package chapters.chapter7;

public class BoxClone {
    double wight;
    double height;
    double depth;

    BoxClone(BoxClone a) {
        wight = a.wight;
        height = a.height;
        depth = a.depth;
    }

    BoxClone(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    BoxClone() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    BoxClone(double len) {
        wight = height = depth = len;
    }

    double volume() {
        return wight * height * depth;
    }
}
