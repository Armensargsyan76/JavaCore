package homework.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker("(hell)o[ f}ro{m j)av[a) isk[et)urba(lal]{{");
        braceChecker.check();

    }
}
