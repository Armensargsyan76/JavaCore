package chapters.chapter12;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import javax.jws.soap.SOAPBinding;

public class AppleDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.GOLDEN_DEL;
        System.out.println("ap :" + ap);
        ap = Apple.REND_DEL;
        System.out.println("ap :" + ap);
        if (ap == Apple.REND_DEL) {
            System.out.println("Переменная ар содержит GoldenDel");
        }
        ap = Apple.JONATHAN;

        switch (ap) {
            case JONATHAN:
                System.out.println("Copт Jonathan красный");
                break;
            case REND_DEL:
                System.out.println("Сорт Golden Delicious желтый");
                break;
        }

        ap = Apple.valueOf("JONATHAN");
        System.out.println("ap :" + ap);
        Apple[] values = Apple.values();
        for (Apple value : values) {
            System.out.println(value);
        }

        System.out.println("Яблoкo сорта Winesap стоит " + Apple.WINESAP.getPrice());
        System.out.println("Цeны на все сорта яблок");
        for (Apple apple : Apple.values()) {
            System.out.println(apple + " стоит " + apple.getPrice());
        }

    }
}
