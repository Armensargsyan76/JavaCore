package chapters.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + " ");
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        vaTest("three argument ", 1, 2, 3);
        System.out.println();
        vaTest("two argument ", 5, 5);
        System.out.println();
        vaTest("zero argument ");
    }
}
