package chapters.chapter6;

public class BoxConstructor {
    double width;
    double height;
    double depth;

    BoxConstructor() {
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}
