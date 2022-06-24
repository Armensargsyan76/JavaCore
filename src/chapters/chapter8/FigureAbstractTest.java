package chapters.chapter8;

public class FigureAbstractTest {
    public static void main(String[] args) {
        RectangleAbstract r = new RectangleAbstract(10, 20);
        TriangleAbstract t = new TriangleAbstract(15, 25);
        FigureAbstract figureF;

        figureF = r;
        System.out.println("Плoщaдь равна" + figureF.area());
        figureF = t;
        System.out.println("Плoщaдь равна" + figureF.area());
    }
}
