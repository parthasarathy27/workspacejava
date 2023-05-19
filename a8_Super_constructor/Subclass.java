package a8_Super_constructor;

public class Subclass extends Superclass {

    Subclass(String a, String b) {
        super (a, b);
    }

    public static void main(String[] args) {

        Subclass s = new Subclass("Hello", "World");
        System.out.println(s.a+" "+s.b);
    }


}
