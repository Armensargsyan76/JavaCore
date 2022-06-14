package chapters.chapter6;

public class BoxConstructorDemo {
    public static void main(String[] args) {
        BoxConstructor myBox = new BoxConstructor();
        BoxConstructor myBox2 = new BoxConstructor();
        double vol;

        vol = myBox.volume();
        System.out.println("Volume = " + vol);
        vol = myBox2.volume();
        System.out.println("Volume = " + vol);

    }
}
