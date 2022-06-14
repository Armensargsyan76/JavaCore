package chapters.chapter7;

public class StackUpgrade {


    private int i;
    private int[] stack;
    private int tos = -1;
    StackUpgrade(int i) {
        stack = new int[i];
    }

    void push(int item) {
        if (tos == stack.length - 1) {
            System.out.println("Stack load");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.print("Stack no loaded");
            return 0;
        } else {
            return stack[tos--];
        }
    }


}
