package chapters.chapter14;

public class BoundsDemo {

    public static void main(String[] args) {

        Integer iNumbers[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(iNumbers);
        double v = iOb.average();
        System.out.println(v);

        Double dNumbers[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dNumbers);
        double d = dOb.average();
        System.out.println(d);
    }
}
