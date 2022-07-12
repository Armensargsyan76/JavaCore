package chapters.chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "Аннотация тестового класса")
@MyAnnot(str = "meta2", val = 100)
public class Meta2 {

    @What(description = "Аннотация тестового класса")
    @MyAnnot(str = "Testing", val = 100)
    public static void meth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("Bce аннотации для класса Meta2");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
            System.out.println();
            Method method = ob.getClass().getMethod("meth");
            annos = method.getAnnotations();
            System.out.println("Bce аннотации для метода myMeth()");
            for (Annotation anno : annos) {
                System.out.println(anno);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден");
        }

    }

    public static void main(String[] args) {
        meth();
    }
}
