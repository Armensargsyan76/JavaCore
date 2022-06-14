package homework.arrayutil;

public class SpaceArrayMethod {
    char[] spaceArray(char[] chars) {
        int startIndex = 0;
        int lastIndex = chars.length - 1;
        while (chars[startIndex] == ' ') {
            startIndex++;
        }
        while (chars[lastIndex] == ' ') {
            lastIndex--;
        }
        char[] result = new char[lastIndex + 1 - startIndex];
        int x = 0;
        for (int i = startIndex; i <= lastIndex; i++) {
            result[x] = chars[i];
            x++;
        }
        return result;
    }
}
