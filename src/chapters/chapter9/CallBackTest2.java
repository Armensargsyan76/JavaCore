package chapters.chapter9;

public class CallBackTest2 {
    public static void main(String[] args) {

        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callBack(5);
        c = ob;
        c.callBack(10);
    }
}
