package super_method;

public class subclass extends superclass{

    public static void main(String[] args) {
        subclass s = new subclass();
        s.mtdsuper();
    }

    private void mtdsuper() {
        super.superMethod("Great Kirikalan Magic Show!!!");
    }
}
