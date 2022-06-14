package chapters.chapter6;

public class BoxConstructorDemo2 {
    public static void main(String[] args) {
        BoxConstructor2 myBox = new BoxConstructor2(10, 20, 15);
        BoxConstructor2 myBox2 = new BoxConstructor2(3, 6, 9);
        double vol;

        vol = myBox.volume();
        System.out.println("Volume = " + vol);
        vol = myBox2.volume();
        System.out.println("Volume = " + vol);
    }
}
