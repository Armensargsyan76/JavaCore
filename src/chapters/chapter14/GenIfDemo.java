package chapters.chapter14;

public class GenIfDemo {

    public static void main(String[] args) {

        Integer[] iNum = {3, 6, 2, 8, 6};
        Character[] chs = {'Ь', 'r', 'р', 'w' };

        MyClass<Integer> iOb = new MyClass<>(iNum);
        MyClass<Character> cOb = new MyClass<>(chs);
        System.out.println("Maкcимaльнoe значение в массиве iOb " + iOb.max());
        System.out.println("Mинимaльнoe значение в массиве iOb " + iOb.min());
        System.out.println("Maкcимaльнoe значение в массиве chs " + cOb.max());
        System.out.println("Mинимaльнoe значение в массиве chs " + cOb.min());
    }
}
