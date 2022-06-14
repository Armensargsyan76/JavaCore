package chapters.chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("int...v ");
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    static void vaTest(boolean... v) {
        System.out.print("boolean...v ");
        for (boolean b : v) {
            System.out.print(b + " ");
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.print("string, int...v ");
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        System.out.println();
        vaTest(true, true, false);
        System.out.println();
        vaTest("baylus ", 1, 2, 3);
    }
}
