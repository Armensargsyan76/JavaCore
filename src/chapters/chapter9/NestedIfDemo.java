package chapters.chapter9;

public class NestedIfDemo {
    public static void main(String[] args) {

        A.NestedIf nid = new B();
        if (nid.isNotNegative(10)) {
            System.out.println("Число 10 неотрицательное");
        }
        if (nid.isNotNegative(-10)) {
            System.out.println("lala");
        }
    }
}
