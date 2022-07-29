package examples;

import java.util.Scanner;

public class Example {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        backToStart();

    }

    public static void backToStart() {
        System.out.println("please input numbers");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        int tmp = chars.length - 1;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[tmp];
            System.out.print(chars[i]);
            tmp--;
        }
    }

}
