package chapters.chapter7;

public class TestObjectReturnDemo {
    public static void main(String[] args) {
        TestObjectReturn ob = new TestObjectReturn(2);
        TestObjectReturn ob2;
        System.out.println("ob.a  :" + ob.a);
        ob2 = ob.icrByTen();
        System.out.println("ob2.a :" + ob2.a);
        ob2 = ob2.icrByTen();
        System.out.println("ob2.a :" + ob2.a);


    }
}
