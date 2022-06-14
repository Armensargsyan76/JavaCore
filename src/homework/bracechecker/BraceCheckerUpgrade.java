package homework.bracechecker;

public class BraceCheckerUpgrade {
    String text;

    BraceCheckerUpgrade(String text) {
        this.text = text;
    }

    void check() {

        Stack myStack = new Stack();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '{':
                case '[':
                    myStack.push(chars[i]);
                    break;
                case ')':
                    char pop = myStack.pop();
                    if (pop != '(' && pop != ' ') {

                        System.out.println("closed " + chars[i] + " but opened " + pop + " at " + i);
                    } else if (pop == ' ') {
                        System.out.println("closed " + chars[i] + " but not opened (" + " at " + i);
                    }
                    break;
                case '}':
                    pop = myStack.pop();
                    if (pop != '{' && pop != ' ') {
                        System.out.println("closed " + chars[i] + " but opened " + pop + " at " + i);
                    } else if (pop == ' ') {
                        System.out.println("closed " + chars[i] + " but not opened {" + " at " + i);
                    }
                    break;
                case ']':
                    pop = myStack.pop();
                    if (pop != '[' && pop != ' ') {
                        System.out.println("closed " + chars[i] + " but opened " + pop + " at " + i);
                    } else if (pop == ' ') {
                        System.out.println("closed " + chars[i] + " but not opened [" + " at " + i);
                    }
                    break;

            }
        }
        boolean b = true;
        char pop;
        while (b) {
            pop = myStack.pop();
            if (pop == ' ') {
                b = false;
            } else {
                System.out.println("opened " + pop + " but not closed");
            }

        }
    }
}
