package chapters.chapter8;

public class OverloadTest {
    public static void main(String[] args) {
        BOverload subOb = new BOverload(5, 8, 9);
        subOb.show();
        subOb.show("this is c : ");
    }
}
