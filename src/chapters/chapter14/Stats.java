package chapters.chapter14;

public class Stats<T extends Number> {

    T[] numbers;

    Stats(T[] o) {
        numbers = o;
    }

    double average() {
        double average = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i].doubleValue();
        }
        return average / numbers.length;
    }

    boolean samAverage(Stats<?> o) {
        if (average() == o.average()) {
            return true;
        } else {
            return false;
        }
    }

}
