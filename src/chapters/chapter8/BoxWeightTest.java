package chapters.chapter8;

public class BoxWeightTest {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(5, 8, 10, 15);
        BoxWeight myBox2 = new BoxWeight(8, 10, 15, 20);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм myBox1 равен : " + vol);
        System.out.println("Вес myBox1 равен :" + myBox1.weight);

        vol = myBox2.volume();
        System.out.println("Oбъeм myBox2 равен : " + vol);
        System.out.println("Вес myBox2 равен : " + myBox2.weight);

        BoxColor myBox3 = new BoxColor(5, 8, 9, 66);
        System.out.println("myBox3 color : " + myBox3.color);
    }
}
