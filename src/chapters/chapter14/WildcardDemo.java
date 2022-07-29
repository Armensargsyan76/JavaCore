package chapters.chapter14;

public class WildcardDemo {

    public static void main(String[] args) {

        Integer[] iNumbers = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(iNumbers);
        double v = iOb.average();
        System.out.println(v);

        Double[] dNumbers = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dNumbers);
        double d = dOb.average();
        System.out.println(d);

        Float[] fNumbers = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fOb = new Stats<>(fNumbers);
        double f = fOb.average();
        System.out.println(f);

        if (iOb.samAverage(dOb)) {
            System.out.println("paвны");
        } else {
            System.out.println("oтличaютcя.");
        }

        if (iOb.samAverage(fOb)) {
            System.out.println("paвны");
        } else {
            System.out.println("oтличaютcя.");
        }
    }
}
