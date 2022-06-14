package chapters.chapter5;

public class IfElse {
    public static void main(String[] args) {

        int mont = 4;
        String season;

        if (mont == 12 || mont == 1 || mont == 2) {
            season = "winter";
        } else if (mont == 3 || mont == 4 || mont == 5) {
            season = "spring";
        } else if (mont == 6 || mont == 7 || mont == 8) {
            season = "summer";
        } else if (mont == 9 || mont == 10 || mont == 11) {
            season = "autumn";
        } else
            season = "fictional month";

        System.out.print("april - " + season);
    }
}
