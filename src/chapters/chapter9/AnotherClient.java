package chapters.chapter9;

public class AnotherClient implements CallBack {

    @Override
    public void callBack(int param) {
        System.out.println("override meth in AnotherClient class" + param);
    }
}
