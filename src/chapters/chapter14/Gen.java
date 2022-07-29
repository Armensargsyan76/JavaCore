package chapters.chapter14;

public class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return (T) ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }

}
