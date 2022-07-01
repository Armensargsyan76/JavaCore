package chapters.chapter10;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("Пoвтopный перехват" + e);
        }
    }

    static void demoThrow() {
        try {
            throw new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле метода demoThrow ()");
            throw e;
        }

    }
}
