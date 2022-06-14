package chapters.chapter7;

public class BoxCloneDemo {
    public static void main(String[] args) {
        BoxClone myBox = new BoxClone(10, 20, 15);
        BoxClone myBox2 = new BoxClone();
        BoxClone myBox3 = new BoxClone(7);
        BoxClone myClone = new BoxClone(myBox);

        System.out.println("myBox :" + myBox.volume());
        System.out.println("myBox2 :" + myBox2.volume());
        System.out.println("myBox3 :" + myBox3.volume());
        System.out.println("myClone :" + myClone.volume());
    }
}
