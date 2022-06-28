package chapters.chapter8;

public class Box {

    double wight;
    double height;
    double depth;

    Box(Box ob) {
        wight = ob.wight;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    Box() {
        wight = -1;
        height = -1;
        depth = -1;
    }

    Box(int len) {

        wight = height = depth = len;
    }

    double volume() {

        return wight * height * depth;
    }
}
