package chapters.chapter6;

public class BoxReturnDemo {
    public static void main(String[] args) {
        BoxReturn myBox = new BoxReturn();
        BoxReturn myBox2 = new BoxReturn();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        vol = myBox.volume1();
        System.out.println("Volume = " + vol);
        vol = myBox2.volume1();
        System.out.println("Volume = " + vol);


    }
}
