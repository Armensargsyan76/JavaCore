package chapters.chapter7;

public class TestObjectParameter {
    int a, b;

    TestObjectParameter(int i, int j) {
        a = i;
        b = j;
    }

    void meth(TestObjectParameter o) {
        o.a *= 2;
        o.b /= 2;
    }
}
