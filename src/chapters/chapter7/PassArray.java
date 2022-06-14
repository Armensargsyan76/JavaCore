package chapters.chapter7;

public class PassArray {
    static void vaTest(int[] v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1, 2, 8};
        int[] n2 = {2, 8};
        int[] n3 = {};
        vaTest(n1);
        System.out.println();
        vaTest(n2);
        System.out.println();
        vaTest(n3);
    }
}
