package chapters.chapter14;

public class Coords<T extends TwoD> {

    T[] coords;

    Coords(T[] o) {
        coords = o;
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("w x y coordinates");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("w x y z");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].c);
        }
    }

    static void showXY(Coords<?> c) {
        System.out.println("coordinates x y");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TwoD[] td = {new TwoD(0, 0), new TwoD(7, 9), new TwoD(18, 4), new TwoD(-1, -23)};
        Coords<TwoD> twoD = new Coords<>(td);
        showXY(twoD);
        ThreeD[] threeDS = {new ThreeD(0, 0, 0), new ThreeD(1, 5, 7), new ThreeD(5, 8, 10)};
        Coords<ThreeD> threeD = new Coords<>(threeDS);
        showXYZ(threeD);

        FourD[] fd = {new FourD(0, 0, 0, 0), new FourD(5, 4, 3, 7), new FourD(7, 6, 9, 2)};
        Coords<FourD> fdOb = new Coords<>(fd);
        showAll(fdOb);
    }


}
