package Stringclass;

public class stringclass {

    public static void main(String[] args) {
        String department = ("Production");
        department.concat("Quality");

        System.out.println("Immutable ====> "+ department);

        department = department.concat("Quality");
        System.out.println("After concatination ===> " + department);
    }
}