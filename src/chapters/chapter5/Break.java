package chapters.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("lala");
                    if (t==true)break second;
                    System.out.println("third");
                }

                System.out.println("second");
            }
            System.out.println("first");
        }
    }
}
