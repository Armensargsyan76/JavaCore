package chapters.chapter7;

public class BoxCons {
    double wight;
    double height;
    double depth;

    BoxCons(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    BoxCons() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    BoxCons(double len) {
        wight = height = depth = len;
    }

    double volume() {
        return wight * height * depth;
    }
}
