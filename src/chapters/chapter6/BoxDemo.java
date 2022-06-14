package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {

        Box myBox = new Box();
        Double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume = " + vol);
    }
}
