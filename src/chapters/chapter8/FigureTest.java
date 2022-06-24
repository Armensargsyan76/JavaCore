package chapters.chapter8;

public class FigureTest {
    public static void main(String[] args) {
        Figure f = new Figure(5, 10);
        Rectangle r = new Rectangle(10, 15);
        Triangle t = new Triangle(16, 20);
        Figure figureF;

        figureF = r;
        System.out.println("Плoщaдь равна" + figureF.area());
        figureF = t;
        System.out.println("Плoщaдь равна" + figureF.area());
        figureF = f;
        System.out.println("Плoщaдь равна" + figureF.area());
    }
}
