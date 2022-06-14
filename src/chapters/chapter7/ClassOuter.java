package chapters.chapter7;

public class ClassOuter {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {

        void display() {
            System.out.println("outer_x :" + outer_x);
        }
    }
}
