package chapters.chapter7;

public class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display(){
                    System.out.println("outer x :" + outer_x);
                }

            }
            Inner inner=new Inner();
            inner.display();
        }

    }
}
