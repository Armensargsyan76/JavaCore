package homework.bracechecker;

public class Stack {

    private int[] stack = new int[20];
    private int tos = -1;

    public void push(int value) {
        if (tos == stack.length-1) {
            System.out.println("stack is load");
        } else {
            stack[++tos] = value;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.print("stack no load");
            return 0;
        }
        return stack[tos--];
    }

}



