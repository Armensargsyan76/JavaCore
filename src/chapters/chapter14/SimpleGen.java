package chapters.chapter14;

public class SimpleGen {

    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Обобщения");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        System.out.println(v);
        String str= tgObj.getOb2();
        System.out.println(str);
    }
}
