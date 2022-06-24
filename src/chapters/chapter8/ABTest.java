package chapters.chapter8;

public class ABTest {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb");
        superOb.show();
        System.out.println();

        subOb.i = 5;
        subOb.j = 7;
        subOb.k = 9;
        System.out.println("Сoдepжимoe объекта subOb");
        subOb.show();
        subOb.showK();
        System.out.println();
        System.out.println("Cyммa i j k  в объекте subOb");
        subOb.showIJK();

    }
}
