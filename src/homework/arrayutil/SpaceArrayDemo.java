package homework.arrayutil;

public class SpaceArrayDemo {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ' };
        SpaceArrayMethod ob = new SpaceArrayMethod();
        char[] chars = ob.spaceArray(spaceArray);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}
