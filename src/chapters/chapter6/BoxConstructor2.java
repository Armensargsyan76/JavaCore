package chapters.chapter6;

public class BoxConstructor2 {
    double width;
    double height;
    double depth;

    BoxConstructor2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

}
