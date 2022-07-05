package chapters.chapter10;

public class ExceptionTest {

    static void compute(int a) throws MyException {
        System.out.println("Bызвaн метод compute( + а + )");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Hopмaльнoe завершение");
    }

    public static void main(String[] args) {

        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Пepexвaчeнo исключение " + e);
        }
    }

}

