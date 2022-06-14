package chapters.chapter6;

public class Stack {
    char[] array = new char[10];
    int tos = -1;

    void push(char item) {
        if (tos == 9) {
            System.out.println("stack filled");
        } else {
            array[++tos] = item;
        }
    }

    char pop() {
        if (tos < 0) {
            System.out.println("stack no loaded");
            return 0;
        } else {
            return array[tos--];
        }
    }
}
