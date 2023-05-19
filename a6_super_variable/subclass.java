package a6_super_variable;

public class subclass extends superclass {

    public static void main(String[] args) {

        subclass s = new subclass();
        s.mtdsuper();
    }

    private void mtdsuper() {
        System.out.println(super.supervariable);
    }
}
