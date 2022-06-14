package homework.bracechecker;

public class Stack {
    private char[] array = new char[10];
    private int tos = -1;

    void push(char item) {
        if (tos == 9) {
            System.out.println("stack filled");
        } else {
            array[++tos] = item;
        }
    }

    char pop() {
        if (tos < 0) {

            return ' ';
        } else {
            return array[tos--];
        }
    }

    boolean isEmpty(){
        return tos == -1;
    }


    }

