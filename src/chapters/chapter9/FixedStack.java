package chapters.chapter9;

public class FixedStack implements IntStack {

    private int[] stack;

    private int tos;

    FixedStack(int size) {
        stack = new int[size];
        tos = -1;
    }

    @Override
    public void push(int size) {
        if (size == stack.length) {
            System.out.println("stack load");
        } else {
            stack[++tos] = size;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("stack no load");
            return 0;
        } else {
            return stack[tos--];
        }

    }
}
