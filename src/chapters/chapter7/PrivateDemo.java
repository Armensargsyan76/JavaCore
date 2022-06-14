package chapters.chapter7;

public class PrivateDemo {
    public static void main(String[] args) {
        TestPrivate ob = new TestPrivate();
        ob.a = 15;
        ob.b = 20;
        ob.setC(100);
        int c = ob.getC();
        System.out.println(c);
    }
}
