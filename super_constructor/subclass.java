package super_constructor;

public class subclass extends superclass {
    subclass(String a, String b) {
        super(a, b);
    }

    public static void main(String[] arg){
        subclass s = new subclass("Great Kirikalan"," show" );
        System.out.println(s.a+" "+s.b);
    }
}
