package chapters.chapter9;

public class StackTest {
    public static void main(String[] args) {

        FixedStack fixStack = new FixedStack(5);
        FixedStack fixStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            fixStack.push(i);
        }
        for (int i = 0; i < 8; i++) {
            fixStack2.push(i);
        }

        System.out.println("stack in fixStack");
        for (int i = 0; i < 5; i++) {
            System.out.print(fixStack.pop() + " ");
        }
        System.out.println();

        System.out.println("stack in fixStack2");
        for (int i = 0; i < 8; i++) {
            System.out.print(fixStack2.pop() + " ");
        }
    }
}
