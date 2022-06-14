package classwork.lesson12;

public class StringTest {
    public static void main(String[] args) {
        String name = " poxos poxosyan  ";
        System.out.println(name.trim());
        name = name.trim();
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String ly = "asdfly";
        System.out.println(ly.endsWith(ly));
        ly = "lyvbjhsc";
        System.out.println(ly.startsWith(ly));
        System.out.println(ly.contains(ly));
        System.out.println(name.substring(6));
        System.out.println(name.substring(6, 12));
        System.out.println(name.substring(6, name.length() - 1));
        System.out.println("length " + name.length());
        String[] split = name.split(" ");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
