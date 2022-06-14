package homework.arrayutil;

import javax.swing.*;

public class CharArrayExample {
    public static void main(String[] args) {

        char c = 'o';
        int qount = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                qount++;
            }
        }
        System.out.println("c = " + qount);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars2[chars2.length / 2 - 1] + " " + chars2[chars2.length / 2]);

        boolean b = false;
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars.length - 2] == 'l') {
            b = true;
        } else b = false;
        System.out.println("b = " + b);


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bob = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {

                bob = true;
            } else bob = false;

        }
        System.out.println("bob = " + bob);

        char[] chars4 = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < chars4.length; i++) {
            if (chars4[i] != ' ') {
                System.out.print(chars4[i] + " ");
            }

        }

    }
}
