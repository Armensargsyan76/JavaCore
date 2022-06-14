package chapters.chapter7;

public class VarArgs {
    static void vaTest(int... v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 35, 5);
        System.out.println();
        vaTest(1, 2);
        System.out.println();
        vaTest();
    }
}
