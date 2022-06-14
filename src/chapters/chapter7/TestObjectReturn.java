package chapters.chapter7;

public class TestObjectReturn {
    int a;

    TestObjectReturn(int i) {
        a = i;
    }

    TestObjectReturn icrByTen() {
        TestObjectReturn ob = new TestObjectReturn(a + 10);
        return ob;
    }
}
