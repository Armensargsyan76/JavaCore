package chapters.chapter8;

public class BoxWeightPrivate extends BoxPrivate {

    double weight;

    BoxWeightPrivate(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeightPrivate() {
        super();
        weight = -1;
    }

    BoxWeightPrivate(double len, double m) {
        super(len);
        weight = m;
    }

    BoxWeightPrivate(BoxWeightPrivate ob) {
        super(ob);
        weight = ob.weight;
    }


}
