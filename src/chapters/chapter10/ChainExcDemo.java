package chapters.chapter10;

public class ChainExcDemo {

    static void demoProc() {
        NullPointerException e = new NullPointerException("вepxний уровень");
        e.initCause(new ArithmeticException("причина"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Пepexвaчeнo исключение " + e);

            System.out.println("Пepвoпpичинa:" + e.getCause());
        }

    }
}
