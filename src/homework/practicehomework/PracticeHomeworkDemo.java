package homework.practicehomework;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {

        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(5));
        System.out.println(ph.calcAge(3));
        System.out.println(ph.nextNumber(5));
        System.out.println(ph.isSame(6, 5));
        System.out.println(ph.lessThanOrEqualToZero(0));
        System.out.println(ph.reverseBool(false));
        int[] array = new int[10];
        int[] array2 = new int[9];
        System.out.println(ph.maxLength(array, array2));
    }

}
