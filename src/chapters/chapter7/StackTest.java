package chapters.chapter7;

import homework.bracechecker.Stack;

public class StackTest {
    public static void main(String[] args) {
        StackUpgrade stack = new StackUpgrade(10);
        StackUpgrade stack2 = new StackUpgrade(10);

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 10; i < 20; i++) {
            stack2.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
