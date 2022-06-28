package chapters.chapter9;

import java.util.Random;

public class StackTest3 {
    public static void main(String[] args) {

        IntStack myStack;

        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 10; i++) {
            myStack.push(i);
        }
        myStack = fs;
        for (int i = 0; i < 8; i++) {
            myStack.push(i);
        }
        myStack = ds;
        for (int i = 0; i < 15; i++) {
            myStack.push(i);
        }

        System.out.println("значения в динамическом стеке");
        for (int i = 0; i < 15; i++) {
            System.out.print(myStack.pop() + " ");
        }
        System.out.println();
        myStack = fs;
        System.out.println("значения в фиксированном стеке");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack.pop() + " ");
        }

    }
}
