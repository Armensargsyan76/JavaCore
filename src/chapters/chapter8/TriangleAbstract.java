package chapters.chapter8;

public class TriangleAbstract extends FigureAbstract {

    TriangleAbstract(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        return dim1 * dim2 / 2;
    }
}
