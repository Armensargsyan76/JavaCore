package classwork.lesson25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateDemo {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("hy"));
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please input date by dd/mm/yyyy format");
        String dateStr = scanner.nextLine();
//        Date now = new Date();
//        System.out.println(now);

        Date parseDate = null;
        try {
            parseDate = sdf.parse(dateStr);
            System.out.println(parseDate);
        } catch (ParseException e) {
            System.out.println("please input date by dd/mm/yyyy format");
        }

    }
}
