package homework.arrayutil;

public class CharArrayExampleMethod {
    int countC(char[] array) {
        int count = 0;
        char c = 'o';
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                count++;
            }
        }
        return count;
    }

    void printMiddleElement(char[] array) {
        System.out.println(array[array.length / 2 - 1] + " " + array[array.length / 2]);
    }

    boolean lastIndex(char[] array) {
        boolean b = false;
        if (array[array.length - 1] == 'y' && array[array.length - 2] == 'l') {
            b = true;
        }
        return b;
    }

    boolean bob(char[] array) {
        boolean b = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 'b' && array[i + 2] == 'b') {
                b = true;
            }
        }
        return b;
    }

    void hello(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                System.out.print(chars[i] + " ");
            }
        }
    }
}

