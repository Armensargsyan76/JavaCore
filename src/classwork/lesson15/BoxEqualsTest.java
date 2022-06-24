package classwork.lesson15;

public class BoxEqualsTest {
    public static void main(String[] args) {

        BoxWeight boxWeight = new BoxWeight(5, 6, 7, 8);
        ColorBox colorBox = new ColorBox(4, 5, 6, 7);
//        printVolumeDouble(boxWeight);
        printVolumeDouble(colorBox);
    }

    static void printVolumeDouble(BoxEquals box) {
        System.out.println(box.volume() * 2);
        if (box instanceof ColorBox) {
            ColorBox colorBox = (ColorBox) box;
            System.out.println(colorBox.color);
        }

    }

}
