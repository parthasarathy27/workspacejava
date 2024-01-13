public class TypeCasting {
    public static void main(String[] args) {
        //widening typecasting
        int num = 9;
        float Myfloat = num;
        //Narrowing typecasting
        float value = 3.14f;
        int Myint = (int)value;

        System.out.println(num);
        System.out.println(Myfloat);
        System.out.println(value);
        System.out.println(Myint);
    }
}
