package chapters.chapter14;

public class GenMethod {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        if (isIn(2, numbers)) {
            System.out.println("Чиcлo 2 содержится в массиве numbers");
        }
        if (!isIn(7, numbers)) {
            System.out.println("Чиcлo 7 отсутствует в массиве numbers");
        }

        String[] str = {"один", "два", "три", "четыре", "пять "};
        if (isIn("два", str)) {
            System.out.println("два содержится в массиве numbers");
        }
        if (!isIn("ceмь", str)) {
            System.out.println("ceмь отсутствует в массиве numbers");
        }


    }

}