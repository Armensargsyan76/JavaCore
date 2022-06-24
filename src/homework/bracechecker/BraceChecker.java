package homework.bracechecker;

public class BraceChecker {
    String text;

    BraceChecker(String text) {
        this.text = text;
    }

    void check() {
        Stack stack = new Stack();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '{':
                case '[':
                    stack.push(chars[i]);
                    break;
            }
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                int pop = stack.pop();
                if (pop == '[' && chars[i] == ']') {
                } else if (chars[i] == ')' || chars[i] == '}') {
                    System.out.println("Error: opened " + (char) pop + " but closed " + chars[i] + " at " + i);
                } else if (pop == '(' && chars[i] == ')') {
                } else if (chars[i] == ']' || chars[i] == '}') {
                    System.out.println("Error: opened " + (char) pop + " but closed " + chars[i] + " at " + i);
                } else if (pop == '{' && chars[i] == '}') {
                } else {
                    if (chars[i] == ')' || chars[i] == ']')
                        System.out.println("Error: opened " + (char) pop + " but closed " + chars[i] + " at " + i);
                }
            }
        }
    }


}


