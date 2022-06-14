package homework.arrayutil;

public class SpaceArrayDemo {
    public static void main(String[] args) {
        SpaceArrayMethod printMassive = new SpaceArrayMethod();
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] results = printMassive.spaceArray(spaceArray);
        for (char c : results) {
            System.out.print(c + " ");
        }
    }
}
