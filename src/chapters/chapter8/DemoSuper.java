package chapters.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeightPrivate myBox1 = new BoxWeightPrivate(5, 8, 7, 10);
        BoxWeightPrivate myBox2 = new BoxWeightPrivate(7, 5, 10, 15);
        BoxWeightPrivate myBox3 = new BoxWeightPrivate();
        BoxWeightPrivate myCube = new BoxWeightPrivate(10, 15);
        BoxWeightPrivate myClone = new BoxWeightPrivate(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("OбЬeм myBox1 равен : " + vol);
        System.out.println("Вес myBox1 равен : " + myBox1.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println("OбЬeм myBox2 равен : " + vol);
        System.out.println("Вес myBox1 равен : " + myBox2.weight);
        System.out.println();
        vol = myBox3.volume();
        System.out.println("OбЬeм myBox3 равен : " + vol);
        System.out.println("Вес myBox3 равен : " + myBox3.weight);
        System.out.println();
        vol = myCube.volume();
        System.out.println("OбЬeм myCube равен : " + vol);
        System.out.println("Вес myCube равен : " + vol);
        System.out.println();
        vol = myClone.volume();
        System.out.println("OбЬeм myClone равен : " + vol);
        System.out.println("Вес myClone равен : " + vol);
    }
}
