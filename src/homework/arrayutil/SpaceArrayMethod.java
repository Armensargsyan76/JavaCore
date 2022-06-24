package homework.arrayutil;

public class SpaceArrayMethod {

    char[] spaceArray(char[] array) {
        int startIndex = 0;
        int lastIndex = array.length - 1;

        while (array[startIndex] == ' ') {
            startIndex++;
        }
        while (array[lastIndex] == ' ') {
            lastIndex--;
        }
        char[] result = new char[lastIndex + 1 - startIndex];
        int tmp = 0;
        for (int i = startIndex; i <= lastIndex; i++) {
            result[tmp] = array[i];
            tmp++;
        }
        return result;
    }
}
