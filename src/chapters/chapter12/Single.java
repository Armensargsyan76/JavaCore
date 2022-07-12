package chapters.chapter12;

import java.lang.reflect.Method;

public class Single {

    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method myMeth = ob.getClass().getMethod("myMeth");
            MySingle annotation = myMeth.getAnnotation(MySingle.class);
            System.out.println(annotation.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
