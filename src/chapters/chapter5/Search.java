package chapters.chapter5;

public class Search {
    public static void main(String[] args) {
        int val = 5;
        boolean found = false;
        int[] nums = {4, 7, 8, 5, 9, 2, 6};
        for (int x : nums) {
            if (val == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("արժեքը գտնված է");
        }
    }
}
