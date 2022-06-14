package homework.arrayutil;

public class CharArrayExampleMethod {
    int count(char[] chars) {
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }
        }
        return count;
    }

    void print(char[] chars) {
        System.out.println(chars[chars.length / 2 - 1] + " " + chars[chars.length / 2]);
    }

    boolean printLast(char[] chars) {
        boolean b = false;
        if (chars[chars.length - 1] == 'e' && chars[chars.length - 2] == 'v') {
            return b = true;
        } else {
            return b = false;
        }
    }

    boolean printBob(char[] chars) {
        boolean b = false;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == 'b' && chars[i + 2] == 'b') {
                b = true;
            }
        }
        return b;
    }

    void print3(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                System.out.print(chars[i] + " ");
            }
        }
    }
}
