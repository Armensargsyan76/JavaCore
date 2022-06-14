package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {

        boolean b;
        b = false;
        System.out.println("b հավասար է " + b);
        b = true;
        System.out.println("b հավասար է " + b);
        if (b) {
            System.out.println("ok");
        }
        b = false;
        if (b) {
            System.out.println("chok");

        }
        System.out.println("10 > 9 հավասար " + (10 > 9));
    }
}
