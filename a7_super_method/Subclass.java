package a7_super_method;

public class Subclass extends Superclass {

    public static void main(String[] args) {

        Subclass s = new Subclass();
        s.mtdsuper();
    }

    private void mtdsuper() {

        super.Supermethod("Hello world");
    }
}
