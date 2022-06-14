package chapters.chapter7;

public class TestObject {
    int a;
    int b;

    TestObject(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(TestObject o) {
        if (o.a == a && o.b == b) {
            return true;
        } else return false;
    }
}
