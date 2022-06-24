package homework.arrayutil;

public class CharArrayDemo {
    public static void main(String[] args) {
        CharArrayExampleMethod ob = new CharArrayExampleMethod();
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        System.out.println(ob.countC(chars));
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        ob.printMiddleElement(chars2);
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        System.out.println(ob.lastIndex(chars3));
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        System.out.println(ob.bob(bobArray));
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        ob.hello(text);
    }
}
