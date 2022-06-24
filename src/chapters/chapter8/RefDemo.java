package chapters.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(5, 8, 9, 12);
        Box plainBox = new Box();
        double vol;
        vol = boxWeight.volume();
        System.out.println("OбЬeм weightBox равен : " + vol);
        System.out.println("Bec weightBox равен :" + boxWeight.weight);
        System.out.println();

        plainBox = boxWeight;
        vol = plainBox.volume();
        System.out.println("OбЬeм plainBox равен : " + vol);

//        plainBox.weight; plainBoxy chuni weight

    }

}
