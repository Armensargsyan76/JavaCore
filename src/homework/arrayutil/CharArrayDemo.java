package homework.arrayutil;

public class CharArrayDemo {
    public static void main(String[] args) {
        CharArrayExampleMethod charMassive = new CharArrayExampleMethod();
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char[] chars1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        char[] chars2 = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int count;
        count = charMassive.count(chars);
        System.out.println("count = " + count);
        charMassive.print(chars);
        System.out.println(charMassive.printLast(chars));
        System.out.println(charMassive.printBob(chars1));
        charMassive.print3(chars2);
    }
}
