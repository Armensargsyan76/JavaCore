package chapters.chapter14;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iob;
        iob = new Gen<>(88);
        iob.showType();
        int v = iob.getOb();
        System.out.println(v);
        Gen<String> strOb = new Gen<>("Тест обобщений");
        strOb.showType();
        String t = strOb.getOb();
        System.out.println(t);
    }
}
