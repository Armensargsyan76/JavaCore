package chapters.chapter9;

public class Client implements CallBack {

    @Override
    public void callBack(int param) {
        System.out.println("override calBack" + param);
    }

    void clientMeth() {
        System.out.println("B классах, реализующих интерфейсы" + "могут определяться и другие члены");
    }

}
