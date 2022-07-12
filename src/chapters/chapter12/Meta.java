package chapters.chapter12;

import java.lang.reflect.Method;

public class Meta {

    @MyAnno(str = "Пример аннотации", val = 100)
    public static void meth() {

        Meta ob = new Meta();
        try {
            Class<? extends Meta> c = ob.getClass();
            Method meth = c.getMethod("meth");
            MyAnno anno = meth.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден");
        }
    }

    public static void main(String[] args) {
        meth();
    }
}
