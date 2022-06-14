package chapters.chapter5;

public class ForVar {
    public static void main(String[] args) {
        boolean done = false;
        int i = 0;
        for (; !done; ) {
            System.out.println("i = " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}
