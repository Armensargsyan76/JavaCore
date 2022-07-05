package chapters.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {

            System.out.println("Пepexвaчeнo исключение " + e);
        }
    }
}
