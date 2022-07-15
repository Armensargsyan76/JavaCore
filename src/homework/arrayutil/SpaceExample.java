package homework.arrayutil;

public class SpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;

        while (spaceArray[startIndex] == ' ') {
            startIndex++;
        }
        while (spaceArray[endIndex] == ' ') {
            endIndex--;
        }

        char[] result = new char[endIndex + 1 - startIndex];
        int x = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[x] = spaceArray[i];
            x++;
        }
        for (char c : result) {
            System.out.print(c);
        }

    }
}


