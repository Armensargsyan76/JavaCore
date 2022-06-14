package chapters.chapter7;

public class TestObjectDemo {
    public static void main(String[] args) {
        TestObject ob1 = new TestObject(100, 22);
        TestObject ob2 = new TestObject(100, 22);
        TestObject ob3 = new TestObject(10, 20);
        System.out.println("ob1 == ob2 :" + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 :" + ob1.equalTo(ob3));
    }
}
