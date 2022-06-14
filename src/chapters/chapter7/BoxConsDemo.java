package chapters.chapter7;

public class BoxConsDemo {
    public static void main(String[] args) {
        BoxCons myBox = new BoxCons(10, 20, 15);
        BoxCons myBox2 = new BoxCons();
        BoxCons myCube = new BoxCons(7);
        double volume;
        volume = myBox.volume();
        System.out.println("myBox  :" + volume);
        volume = myBox2.volume();
        System.out.println("myBox2 : " + volume);
        volume = myCube.volume();
        System.out.println("myCube : " + volume);
    }
}
