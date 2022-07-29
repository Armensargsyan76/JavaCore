package homework.bracechecker;

public class BraceCheckerUpgrade {

    String text;

    private Stack stack = new Stack(20);
    private Stack stackForIndex = new Stack(20);

    BraceCheckerUpgrade(String text) {
        this.text = text;
    }

    void check() {
        char[] chars = text.toCharArray();
        int pop;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '{':
                case '[':
                    stack.push(chars[i]);
                    stackForIndex.push(i);
                    break;
                case ')':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed " + chars[i] + " but not opened ad " + i);
                    } else if (pop != '(') {
                        System.out.println("Error: closed " + chars[i] + " but opened " + (char) pop + " ad " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed " + chars[i] + " but not opened ad " + i);
                    } else if (pop != '[') {
                        System.out.println("Error: closed " + chars[i] + " but opened " + (char) pop + " ad " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    stackForIndex.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed " + chars[i] + " but not opened ad " + i);
                    } else if (pop != '{') {
                        System.out.println("Error: closed " + chars[i] + " but opened " + (char) pop + " ad " + i);
                    }
                    break;
            }

        }
        int last;
        while ((last = stack.pop()) != 0) {
            System.out.println("Error: opened " + (char) last + " but not closed at " + stackForIndex.pop());
        }
    }
}

