package classwork.lesson20;

public class EnumDemo {
    public static void main(String[] args) {

        Gender g = Gender.MALE;
        String genderStr = g.name();
        System.out.println(g);
        System.out.println(genderStr);
        String gender = "FEMALE";
        try {
            Gender gender1 = Gender.valueOf(gender.toUpperCase());
            System.out.println(gender);
        } catch (IllegalArgumentException e) {
            System.out.println("please input correct gender");
        }


    }

}
