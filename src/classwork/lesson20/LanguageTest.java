package classwork.lesson20;

import java.util.Scanner;

public class LanguageTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Language l = Language.RU;

        switch (l) {
            case HY:
                System.out.println("bayluuss");
                break;
            case RU:
                System.out.println("привеет");
                break;
            case ENG:
                System.out.println("hi");
                break;
            default:
                System.out.println("hello");
        }

        System.out.println("please choose language");
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        String languageStr = scanner.nextLine();
        if (languageStr != null) {
            try {
                Language chooseLang = Language.valueOf(languageStr.toUpperCase());
                System.out.println("chosen  : " + chooseLang);
                System.out.println("country : " + chooseLang.getCountry());
            } catch (IllegalArgumentException e) {
                System.out.println("please choose correct language");

            }

        }

    }
}
