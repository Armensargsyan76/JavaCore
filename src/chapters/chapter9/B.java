package chapters.chapter9;

public class B implements A.NestedIf {

    @Override
    public boolean isNotNegative(int index) {

        return index < 0 ? false : true;
    }
}
