package chapters.chapter7;

public class TestObjectParameterDemo {
    public static void main(String[] args) {
        TestObjectParameter ob = new TestObjectParameter(15, 20);
        System.out.println("a, b before method :" + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("a, b after method  :" + ob.a + " " + ob.b);
    }

}
