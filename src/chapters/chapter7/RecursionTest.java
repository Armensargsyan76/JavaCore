package chapters.chapter7;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion ob = new Recursion(10);
        for (int i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}
