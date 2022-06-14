package classwork.lesson10;

public class FigurePainterDemo {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter();
        fp.c = '#';
        fp.figureOne();
        System.out.println();
        fp.figureFour();
        System.out.println();
        fp.figureThree();
        System.out.println();
        fp.figureFive();
        FigurePainter fp2 = new FigurePainter();
        fp2.c = fp.c;
        fp2.figureTwo();
    }
}
