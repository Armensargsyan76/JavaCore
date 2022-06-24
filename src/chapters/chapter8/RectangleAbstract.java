package chapters.chapter8;

public class RectangleAbstract extends FigureAbstract {

    RectangleAbstract(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}
