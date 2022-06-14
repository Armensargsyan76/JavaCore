package chapters.chapter6;

public class BoxReceivingDemo {
    public static void main(String[] args) {
        BoxReceiving myBox = new BoxReceiving();
        BoxReceiving myBox2 = new BoxReceiving();
        double vol;

        myBox.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        vol = myBox.volume();
        System.out.println("Volume = " + vol);
        vol = myBox2.volume();
        System.out.println("Volume = " + vol);
    }
}
