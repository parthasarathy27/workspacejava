public class Variable {
    //Global Variable
    static int a = 20;
    public static void main(String[] args) {
        //Local Variable
        System.out.println("India = " + a);
        Tamilnadu();
        Kerala();
        karnataka();
        AndhraPradhesh();
    }
    public static void Tamilnadu() {
        //local variable
        int b = 10;
        int c = a + b;
        System.out.println("TamilNadu = " + c);
    }
    public static void Kerala() {
        //local variable
        int b = 30;
        int c = a - b;
        System.out.println("kerala = " + c);
    }
    public static void karnataka() {
        //local variable
        int b = 30;
        int c = a * b;
        System.out.println("karnataka = " + c);
    }
    public static void AndhraPradhesh() {
        //local variable
        int b = 30;
        int c = a / b;
        System.out.println("AndhraPradhesh = " + c);
    }
}
