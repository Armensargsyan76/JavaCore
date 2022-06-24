package homework.practicehomework;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ob = new PracticeHomework();
        long convert = ob.convert(5);
        System.out.println(convert);
        long l = ob.calcAge(2);
        System.out.println(l);
        int i = ob.nextNumber(5);
        System.out.println(i);
        boolean sameNum = ob.isSameNum(5, 5);
        System.out.println(sameNum);
        boolean b = ob.lessThanOrEqualToZero(1);
        System.out.println(b);
        boolean b1 = ob.reverseBool(false);
        System.out.println(b1);
        int[] array = new int[18];
        int[] array1 = new int[15];
        int i1 = ob.maxLength(array1, array);
        System.out.println(i1);
    }

}
