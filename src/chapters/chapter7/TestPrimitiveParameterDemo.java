package chapters.chapter7;

public class TestPrimitiveParameterDemo {
    public static void main(String[] args) {
        TestPrimitiveParameter ob = new TestPrimitiveParameter();
        int a = 15;
        int b = 20;
        System.out.println("a, b before method :" + a + " " + b);
        ob.meth(a, b);
        System.out.println("a, b after method  :" + a + " " + b);

    }

}