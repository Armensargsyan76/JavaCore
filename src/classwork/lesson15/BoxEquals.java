package classwork.lesson15;

public class BoxEquals {

    public double wight;
    public double height;
    public double depth;

    BoxEquals(double w, double h, double d) {
        wight = w;
        height = h;
        depth = d;
    }

    double volume() {
        return wight * height * depth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) return false;

        BoxEquals box = (BoxEquals) obj;
        return wight == box.wight
                && height == box.height
                && depth == box.depth;
    }

    @Override
    public String toString() {
        return "wight: " + wight + " height: " + height + " depth: " + depth;
    }


}
